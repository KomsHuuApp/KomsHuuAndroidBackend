package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person getPersonByIdAndApartmentId(long id, long apartmentId);

    List<Person> findAllByApartmentId(long apartmentId);

    List<Person> findAllByFlatNumberAndApartmentId(int flatNumber, long apartmentId);
}
