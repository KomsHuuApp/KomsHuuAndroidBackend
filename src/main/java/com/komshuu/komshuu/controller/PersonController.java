package com.komshuu.komshuu.controller;

import com.komshuu.komshuu.model.*;
import com.komshuu.komshuu.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author sozboke
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

    @Autowired
    private ComplaintRepository complaintRepository;

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

    @PutMapping("/updatePerson")
    public Person updatePerson(@Valid @RequestBody Person person) {
        return personRepository.save(person);
    }

    @DeleteMapping("/deletePerson")
    public boolean deletePerson(@Valid @RequestBody Person person) {
        if(personRepository.getPersonByIdAndApartmentId(person.getId(), person.getApartmentId()) != null) {
            personRepository.delete(person);
            return true;
        }
        return false;
    }

    @GetMapping("/getEmergencyNumbers")
    public List<EmergencyCallNumber> getEmergencyNumbers(@RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return emergencyCallNumberRepository.findAllByApartmentId(apartmentId);
    }

    @PostMapping("/addComplaint")
    public Complaint addComplaint(@Valid @RequestBody Complaint complaint) {
        return complaintRepository.save(complaint);
    }

    @GetMapping("/getComplaints")
    public List<Complaint> getComplaints(@RequestParam(value = "apartmentId", required = true) long apartmentId) {
        return complaintRepository.findAllByApartmentId(apartmentId);
    }

    @PutMapping("/updateComplaint")
    public Complaint updateComplaint(@Valid @RequestBody Complaint complaint) {
        return complaintRepository.save(complaint);
    }

    @DeleteMapping("/deleteComplaint")
    public boolean deleteComplaint(@Valid @RequestBody Complaint complaint) {
        if(complaintRepository.getComplaintByApartmentIdAndPersonID(complaint.getApartmentId(), complaint.getPersonID()) != null) {
            complaintRepository.delete(complaint);
            return true;
        }
        return false;
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

    @PutMapping("/updateOrder")
    public Order updateOrder(@Valid @RequestBody Order order) {
        return orderRepository.save(order);
    }

    @DeleteMapping("/deleteOrder")
    public boolean deleteOrder(@Valid @RequestBody Order order) {
        if(orderRepository.getByOrderIdAndApartmentId(order.getOrderId(), order.getApartmentId()) != null) {
            orderRepository.delete(order);
            return true;
        }
        return false;
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

    @PutMapping("/updateAnnouncement")
    public Announcement updateAnnouncement(@Valid @RequestBody Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    @DeleteMapping("/deleteAnnouncement")
    public boolean deleteAnnouncement(@Valid @RequestBody Announcement announcement) {
        if(announcementRepository.findAnnouncementByAnnouncementId(announcement.getAnnouncementId()) != null) {
            announcementRepository.delete(announcement);
            return true;
        }
        return false;
    }
}