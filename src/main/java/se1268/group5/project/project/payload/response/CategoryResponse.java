package se1268.group5.project.project.payload.response;

import se1268.group5.project.project.model.ShoesCategory;

import java.util.List;

public class CategoryResponse extends ApiResponse {
    private List<ShoesCategory> categoryList;


    public CategoryResponse(Boolean success, String message, List<ShoesCategory> categoryList) {
        super(success, message);
        this.categoryList = categoryList;
    }

    public List<ShoesCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<ShoesCategory> categoryList) {
        this.categoryList = categoryList;
    }
}
