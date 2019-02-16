package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository  extends JpaRepository<Complaint, Long> {
    List<Complaint> findAllByApartmentId(long apartmentId);

    Complaint getComplaintByApartmentIdAndPersonID(long apartmentId, long personId);
}
