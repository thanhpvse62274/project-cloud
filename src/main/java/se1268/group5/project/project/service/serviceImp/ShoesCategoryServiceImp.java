package se1268.group5.project.project.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se1268.group5.project.project.model.ShoesCategory;
import se1268.group5.project.project.payload.response.ApiResponse;
import se1268.group5.project.project.payload.response.CategoryResponse;
import se1268.group5.project.project.repository.ShoesCategoryRepository;
import se1268.group5.project.project.service.ShoesCategoryService;

import java.util.List;


@Service
public class ShoesCategoryServiceImp implements ShoesCategoryService {

    @Autowired
    ShoesCategoryRepository shoesCategoryRepository;

    @Override
    public CategoryResponse getCategory() {
        List<ShoesCategory> shoesCategories = shoesCategoryRepository.findAll();
        CategoryResponse response = new CategoryResponse(true,"Get all shoes category successfully", shoesCategories);
        return response;
    }

    @Override
    public ApiResponse addNewCategory(String name) {
        shoesCategoryRepository.save(new ShoesCategory(name));
        return new ApiResponse(true,"A Category Successfully");
    }
}
