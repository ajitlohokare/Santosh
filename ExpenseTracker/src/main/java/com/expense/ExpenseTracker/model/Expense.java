package com.expense.ExpenseTracker.model;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_expense")

public class Expense {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
   
    private String description;
    
    private BigDecimal amount;
    
    private String note;
    
    private Long created_at;

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(Long id, String description, BigDecimal amount, String note, Long created_at) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.note = note;
		this.created_at = created_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Long created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", description=" + description + ", amount=" + amount + ", note=" + note
				+ ", created_at=" + created_at + "]";
	}
    
    

}




