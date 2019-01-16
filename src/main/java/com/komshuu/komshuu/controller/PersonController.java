package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.Announcement;
import com.komshuu.komshuu.model.EmergencyCallNumber;
import com.komshuu.komshuu.model.Order;
import com.komshuu.komshuu.model.Person;
import com.komshuu.komshuu.repository.AnnouncementRepository;
import com.komshuu.komshuu.repository.EmergencyCallNumberRepository;
import com.komshuu.komshuu.repository.OrderRepository;
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

    @Autowired
    private EmergencyCallNumberRepository emergencyCallNumberRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private AnnouncementRepository announcementRepository;

    @PostMapping("/addPerson")
    public Person addNewPerson(@Valid @RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/getAllPeople")
    public List<Person> getAllPeople(@RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return personRepository.findAllByApartmentId(apartmentId);
    }

    @GetMapping("/getPersonById")
    public Person getPersonById(@RequestParam(value = "id", required = true) long id, @RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return personRepository.getPersonByIdAndApartmentId(id,apartmentId);
    }

    @GetMapping("/getPeopleByFlatNo")
    public List<Person> getPeopleByFlatNo(@RequestParam(value = "flatNumber", required = true) int flatNumber, @RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return personRepository.findAllByFlatNumberAndApartmentId(flatNumber, apartmentId);
    }

    @GetMapping("/getPersonRelativeNumber")
    public String getPersonRelativeNumber(@RequestParam(value = "id", required = true) long id, @RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return personRepository.getPersonByIdAndApartmentId(id, apartmentId).getRelativeNumber();
    }

    @GetMapping("/getPersonNumber")
    public String getPersonNumber(@RequestParam(value = "id", required = true) long id, @RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return personRepository.getPersonByIdAndApartmentId(id, apartmentId).getNumber();
    }

    @GetMapping("/getEmergencyNumbers")
    public List<EmergencyCallNumber> getEmergencyNumbers(@RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return emergencyCallNumberRepository.findAllByApartmentId(apartmentId);
    }

    @PostMapping("/addOrder")
    public Order addOrder(@Valid @RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping("/getOrders")
    public List<Order> getOrders(@RequestParam(value = "role") long role, @RequestParam(value = "apartmentId") long apartmentId) {
        if (role == 3) {
            return orderRepository.findAllByApartmentId(apartmentId);
        }
        return null;
    }

    @GetMapping("/getOrder")
    public Order getOrder(@RequestParam(value = "orderId") long orderId) {
        return orderRepository.findByOrderId(orderId);
    }

    @PostMapping("/addAnnouncement")
    public Announcement addAnnouncement(@Valid @RequestBody Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    @GetMapping("/getAnnouncements")
    public List<Announcement> getAnnouncements(@RequestParam(value = "apartmentId") long apartmentId) {
        return announcementRepository.findAllByApartmentId(apartmentId);
    }

    @GetMapping("/getAnnouncement")
    public Announcement getAnnouncement(@RequestParam(value = "announcementId") long announcementId) {
        return announcementRepository.findAnnouncementByAnnouncementId(announcementId);
    }
}