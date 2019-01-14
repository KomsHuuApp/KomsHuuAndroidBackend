package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.Apartment;
import com.komshuu.komshuu.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

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
}
