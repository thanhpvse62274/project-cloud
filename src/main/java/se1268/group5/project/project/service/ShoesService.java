package se1268.group5.project.project.service;

import se1268.group5.project.project.payload.response.ListShoesResponse;
import se1268.group5.project.project.payload.response.ShoesResponse;

public interface ShoesService {
    ListShoesResponse getAllShoes();
    ShoesResponse getShoesByID(Long shoesID);
}
