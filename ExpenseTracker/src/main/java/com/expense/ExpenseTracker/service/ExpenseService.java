package com.expense.ExpenseTracker.service;

import java.util.List;

import com.expense.ExpenseTracker.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	void save(Expense expense);
	
	Expense findById(Long id);

	void delete(Long id);
}
