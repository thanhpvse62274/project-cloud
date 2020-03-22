package se1268.group5.project.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
