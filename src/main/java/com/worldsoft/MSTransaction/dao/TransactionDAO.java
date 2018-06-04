/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSTransaction.dao;

import com.worldsoft.MSTransaction.model.Transaction;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Guqnn
 */
@Repository
public interface TransactionDAO extends JpaRepository<Transaction, Long> {
    
    public List<Transaction> findAllByUsername(String username);
}
