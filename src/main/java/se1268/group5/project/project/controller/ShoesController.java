package se1268.group5.project.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se1268.group5.project.project.payload.response.ListShoesResponse;
import se1268.group5.project.project.payload.response.ShoesResponse;
import se1268.group5.project.project.service.ShoesService;

import java.util.List;

@RestController
@RequestMapping("/api/shoes")
public class ShoesController {

    @Autowired
    private ShoesService shoesService;

    @GetMapping
    public ListShoesResponse getAllShoes() {
        ListShoesResponse response = shoesService.getAllShoes();
        return response;
    }

    @GetMapping("/{shoesid}")
    public ShoesResponse getShoesByID(@PathVariable Long shoesid) {
        ShoesResponse response = shoesService.getShoesByID(shoesid);
        return response;
    }

}
