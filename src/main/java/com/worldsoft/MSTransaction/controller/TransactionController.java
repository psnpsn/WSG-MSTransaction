/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSTransaction.controller;

import com.worldsoft.MSTransaction.model.Transaction;
import com.worldsoft.MSTransaction.service.TransactionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guqnn
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {
    
    @Autowired
    private TransactionService transactionService;
    
    @PostMapping("/transaction")
    public Transaction addTransaction(@RequestBody Transaction tran){
        return transactionService.add(tran);
    }
    
    @GetMapping("/transaction/{username}")
    public List<Transaction> getTransactions(@PathVariable String username) {
        List<Transaction> list = transactionService.findByClient(username);
        System.out.println(list);
	return list;
    }
    
}
