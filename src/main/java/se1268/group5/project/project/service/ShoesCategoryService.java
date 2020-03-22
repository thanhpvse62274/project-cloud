package se1268.group5.project.project.service;

import se1268.group5.project.project.payload.response.ApiResponse;
import se1268.group5.project.project.payload.response.CategoryResponse;



public interface ShoesCategoryService {
    CategoryResponse getCategory();
    ApiResponse addNewCategory(String name);
}
