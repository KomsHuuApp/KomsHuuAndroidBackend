package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.Person;
import com.komshuu.komshuu.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*
@author Servet Özböke
 */

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/demo")
    public String demoController() {
        return "Hello";
    }

    @PostMapping("/addPerson")
    public Person createNewPerson(@Valid @RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/getAllPeople")
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @GetMapping("/getPersonById")
    public Person getPersonById(@RequestParam(value = "id", required = true) long id) {
        return personRepository.getPersonById(id);
    }
}
