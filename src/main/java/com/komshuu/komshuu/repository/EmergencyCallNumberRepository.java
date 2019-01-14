package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.EmergencyCallNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ecyamak
 */

@Repository
public interface EmergencyCallNumberRepository extends JpaRepository<EmergencyCallNumber, Long> {
}
