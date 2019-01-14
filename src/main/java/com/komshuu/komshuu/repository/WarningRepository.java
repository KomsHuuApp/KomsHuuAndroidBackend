package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Warning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarningRepository extends JpaRepository<Warning, Long> {
}
