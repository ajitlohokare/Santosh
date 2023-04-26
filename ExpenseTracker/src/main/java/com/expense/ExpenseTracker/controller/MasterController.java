package com.expense.ExpenseTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.expense.ExpenseTracker.model.Expense;
import com.expense.ExpenseTracker.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService;

	@GetMapping("/")
	public ModelAndView home() {
		
		ModelAndView mav= new ModelAndView("home");
		mav.addObject("message","List of expenses");
		List<Expense> expenses=expenseService.findAll();
		System.out.println(expenses);		
		mav.addObject("expenses",expenses);	
		return mav;
	}
	
	@GetMapping("/expense")
	public ModelAndView addexpense() {
		
		ModelAndView mav= new ModelAndView("expense");
		mav.addObject("expense",new Expense());	
		return mav;
	}
	
	
//	@RequestMapping(value="/expense",method=RequestMethod.POST)
	@PostMapping("/expense")
	public String save(@ModelAttribute("expense") Expense expense) {
		expenseService.save(expense);
		return "redirect:/";
	}
	
	
	@GetMapping("/expense/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		ModelAndView mav= new ModelAndView("expense");
		Expense expense = expenseService.findById(id);
		mav.addObject("expense",expense);
		return mav;
	}
	
	@GetMapping("/expense/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/";
	}
	
	
}




/*old code 
 * 
  
  
package com.expense.ExpenseTracker.controller;
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.expense.ExpenseTracker.model.Expense;
import com.expense.ExpenseTracker.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService;

	@RequestMapping("/")
	public ModelAndView home() {
		
		ModelAndView mav= new ModelAndView("home");
		mav.addObject("message","List of expenses");
		List<Expense> expenses=expenseService.findAll();
		System.out.println(expenses);		
		//mav.addObject("expenses",expenses);		
		return mav;
	}
}

*/