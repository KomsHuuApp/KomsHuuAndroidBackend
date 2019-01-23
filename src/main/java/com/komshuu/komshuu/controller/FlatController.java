package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.Flat;
import com.komshuu.komshuu.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author sozboke
 */
@RestController
public class FlatController {

    @Autowired
    private FlatRepository flatRepository;

    @PostMapping("/addFlat")
    public Flat createNewFlat(@Valid @RequestBody Flat flat) {
        return flatRepository.save(flat);
    }

    @GetMapping("/getAllFlats")
    public List<Flat> getAllFlats(@RequestParam(value = "apartmentId", required = true)long apartmentId) {
        return flatRepository.getFlatsByApartmentId(apartmentId);
    }

    @GetMapping("/getFlatById")
    public Flat getFlatById(@RequestParam(value = "flatId", required = true) long flatId,@RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return flatRepository.getFlatByFlatIdAndApartmentId(flatId, apartmentId);
    }

    @GetMapping("/getFlatByNo")
    public Flat getFlatByNo(@RequestParam(value = "flatNumber", required = true) int flatNumber, @RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return flatRepository.getFlatByFlatNumberAndApartmentId(flatNumber, apartmentId);
    }

    @PutMapping("/updateFlat")
    public Flat updateFlat(@Valid @RequestBody Flat flat) {
        return flatRepository.save(flat);
    }

    @DeleteMapping("/deleteFlat")
    public boolean deleteFlat(@Valid @RequestBody Flat flat) {
        if(flatRepository.getFlatByFlatIdAndApartmentId(flat.getFlatId(), flat.getApartmentId()) != null) {
            flatRepository.delete(flat);
            return true;
        }
        return false;
    }
}
