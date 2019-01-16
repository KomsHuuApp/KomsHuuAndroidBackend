package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Dues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuesRepository extends JpaRepository<Dues, Long> {

}
