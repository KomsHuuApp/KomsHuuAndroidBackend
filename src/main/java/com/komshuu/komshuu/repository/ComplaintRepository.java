package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRepository  extends JpaRepository<Complaint, Long> {
}
