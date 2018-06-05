/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSTransaction.service;

import com.worldsoft.MSTransaction.dao.TransactionDAO;
import com.worldsoft.MSTransaction.model.Transaction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guqnn
 */
@Service
public class TransactionService {
    
    @Autowired
    private TransactionDAO transactionDAO;
    
    public List<Transaction> findByClient(String username){
        return transactionDAO.findAllByUsername(username);
    }
    
    public Transaction add(Transaction tran){
        return transactionDAO.save(tran);
    }
    
    public int countByCategorie(int c){
        return transactionDAO.countByCategorie(c);
    }
    
}
