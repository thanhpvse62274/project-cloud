package se1268.group5.project.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import se1268.group5.project.project.payload.request.NewCategoryRequest;
import se1268.group5.project.project.payload.response.ApiResponse;
import se1268.group5.project.project.payload.response.CategoryResponse;
import se1268.group5.project.project.service.ShoesCategoryService;


@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private ShoesCategoryService shoesCategoryService;

    @GetMapping
    public CategoryResponse getCategory(){
        CategoryResponse response = shoesCategoryService.getCategory();
        return response;
    }

    @PostMapping
    public ApiResponse addNeưCategory(@RequestBody NewCategoryRequest request){
        return shoesCategoryService.addNewCategory(request.getName());
    }


}
