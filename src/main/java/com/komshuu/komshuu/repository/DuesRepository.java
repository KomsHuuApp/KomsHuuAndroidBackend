package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Dues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DuesRepository extends JpaRepository<Dues, Long> {
    List<Dues> findAllByApartmentIdAndFlatNumber(long apartmentId, long flatNumber);

    Dues findByDuesId(long duesId);
}
