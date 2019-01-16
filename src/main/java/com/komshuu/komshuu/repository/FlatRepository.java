package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Long> {
    Flat getFlatByFlatIdAndApartmentId(long id, long apartmentId);

    List<Flat> getFlatsByApartmentId(long apartmentId);

    Flat getFlatByFlatNumberAndApartmentId(int flatNumber, long apartmentId);
}
