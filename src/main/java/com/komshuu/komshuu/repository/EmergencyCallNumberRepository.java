package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.EmergencyCallNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ecyamak
 */

@Repository
public interface EmergencyCallNumberRepository extends JpaRepository<EmergencyCallNumber, Long> {
    List<EmergencyCallNumber> findAllByApartmentId(long apartmentId);

    EmergencyCallNumber findByNumberIdAndApartmentId(long id, long apartmentId);
}
