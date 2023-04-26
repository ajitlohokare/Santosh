package com.expense.ExpenseTracker.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.ExpenseTracker.model.Expense;
import com.expense.ExpenseTracker.repository.ExpenseRepository;

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();	
		}

	@Override
	public void save(Expense expense) {
	
		expense.setCreated_at(System.currentTimeMillis());
		expenseRepository.save(expense);
	}

	@Override
	public Expense findById(Long id) {
		if(expenseRepository.findById(id).isPresent()){
			
			return expenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
	 Expense expense = findById(id);
	 expenseRepository.delete(expense);
		
	}

}
