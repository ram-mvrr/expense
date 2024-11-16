package com.personal.expense.service;

import com.personal.expense.model.Expense;
import com.personal.expense.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense addExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public Optional<Expense> getExpense(Long id){
        return expenseRepository.findById(id);
    }

    public void deleteExpense(Long id){
        expenseRepository.deleteById(id);
    }
}
