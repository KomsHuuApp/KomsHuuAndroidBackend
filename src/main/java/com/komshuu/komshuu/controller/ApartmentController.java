package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.Apartment;
import com.komshuu.komshuu.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author sozboke
 */
@RestController
public class ApartmentController {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @PostMapping("/addApartment")
    public Apartment createNewApartment(@Valid @RequestBody Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    @GetMapping("/getAllApartmens")
    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }

    @GetMapping("/getApartmentById")
    public Apartment getApartmentById(@RequestParam(value = "apartmentId", required = true) long id) {
        return apartmentRepository.getApartmentByApartmentId(id);
    }

    @PutMapping("/updateApartment")
    public Apartment updateApartment(@Valid @RequestBody Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    @DeleteMapping("/deleteApartment")
    public boolean deleteApartment(@Valid @RequestBody Apartment apartment) {
        if(apartmentRepository.getApartmentByApartmentId(apartment.getApartmentId()) != null) {
            apartmentRepository.delete(apartment);
            return true;
        }
        return false;
    }

}
