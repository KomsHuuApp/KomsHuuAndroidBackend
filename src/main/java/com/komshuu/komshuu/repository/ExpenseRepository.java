package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
