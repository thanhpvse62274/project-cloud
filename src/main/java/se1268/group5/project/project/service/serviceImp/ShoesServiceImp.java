package se1268.group5.project.project.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se1268.group5.project.project.model.Shoes;
import se1268.group5.project.project.payload.response.ListShoesResponse;
import se1268.group5.project.project.repository.ShoesRepository;
import se1268.group5.project.project.service.ShoesService;

import java.util.List;

@Service
public class ShoesServiceImp implements ShoesService {
    @Autowired
    ShoesRepository shoesRepository;

    @Override
    public ListShoesResponse getAllShoes() {
        List<Shoes> list = shoesRepository.findAll();
        ListShoesResponse listShoesResponse = new ListShoesResponse(true,"get all shoes successfully",list);
        return listShoesResponse;
    }
}
