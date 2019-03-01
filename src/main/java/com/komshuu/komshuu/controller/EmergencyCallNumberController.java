package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.Complaint;
import com.komshuu.komshuu.model.EmergencyCallNumber;
import com.komshuu.komshuu.repository.EmergencyCallNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author sozboke
 */
@RestController
public class EmergencyCallNumberController {

    @Autowired
    private EmergencyCallNumberRepository emergencyCallNumberRepository;

    @PostMapping("/addEmergencyCallNumber")
    public EmergencyCallNumber addEmergencyCallNumber(@Valid @RequestBody EmergencyCallNumber emergencyCallNumber) {
        return emergencyCallNumberRepository.save(emergencyCallNumber);
    }

    @GetMapping("/deleteEmergencyNumber")
    public boolean deleteEmergencyNumber(@RequestParam(value = "id", required = true) long id, @RequestParam(value = "apartmentId",required = true)long apartmentId) {
        EmergencyCallNumber emergencyCallNumber = emergencyCallNumberRepository.findByNumberIdAndApartmentId(id, apartmentId);
        if (emergencyCallNumber != null) {
            emergencyCallNumberRepository.delete(emergencyCallNumber);
            return true;
        }
        return false;
    }
}