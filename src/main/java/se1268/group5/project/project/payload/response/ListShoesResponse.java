package se1268.group5.project.project.payload.response;

import se1268.group5.project.project.model.Shoes;

import java.util.List;

public class ListShoesResponse extends ApiResponse {
    private List<Shoes> shoesList;

    public ListShoesResponse(Boolean success, String message, List<Shoes> shoesList) {
        super(success, message);
        this.shoesList = shoesList;
    }

    public List<Shoes> getShoesList() {
        return shoesList;
    }

    public void setShoesList(List<Shoes> shoesList) {
        this.shoesList = shoesList;
    }
}
