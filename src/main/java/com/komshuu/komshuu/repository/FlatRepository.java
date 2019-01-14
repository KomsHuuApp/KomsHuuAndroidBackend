package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Long> {
}
