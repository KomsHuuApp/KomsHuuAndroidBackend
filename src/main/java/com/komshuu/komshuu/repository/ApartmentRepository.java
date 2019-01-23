package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sozboke
 */
@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    Apartment getApartmentByApartmentId(long id);
}
