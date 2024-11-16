package com.personal.expense.controller;

import com.personal.expense.model.Expense;
import com.personal.expense.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    private final ExpenseService expenseService;


    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense){
        return expenseService.addExpense(expense);
    }

    @GetMapping
    public List<Expense> getAllExpense(){
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Optional<Expense> getExpense(@PathVariable Long id){
        return expenseService.getExpense(id);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(Long id){
        expenseService.deleteExpense(id);
    }
}
