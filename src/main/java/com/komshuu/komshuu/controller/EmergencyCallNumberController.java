package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.EmergencyCallNumber;
import com.komshuu.komshuu.repository.EmergencyCallNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmergencyCallNumberController {

    @Autowired
    private EmergencyCallNumberRepository emergencyCallNumberRepository;

    @PostMapping("/addEmergencyCallNumber")
    public EmergencyCallNumber addEmergencyCallNumber(@Valid @RequestBody EmergencyCallNumber emergencyCallNumber) {
        return emergencyCallNumberRepository.save(emergencyCallNumber);
    }
}
