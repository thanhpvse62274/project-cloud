package se1268.group5.project.project.payload.response;

import se1268.group5.project.project.model.Shoes;

public class ShoesResponse extends ApiResponse {

    private Shoes shoes;



    public ShoesResponse(Boolean success, String message, Shoes shoes) {
        super(success, message);
        this.shoes = shoes;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
}
