package com.expense.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.ExpenseTracker.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	
}
