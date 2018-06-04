/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSTransaction.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Guqnn
 */
@Entity
public class Transaction {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private LocalDate dateTransaction;
    private String codeAirport;
    private long idTown;
    private int adult;
    private int enfant;
    private int bebe;
    private long prix;
    private String username;
    private long idCategorie;

    public Transaction() {
    }

    
    
    public Transaction(LocalDate dateTransaction, String codeAirport, long idTown, int adult, int enfant, int bebe, long prix, String username, long idCategorie) {
        this.dateTransaction = dateTransaction;
        this.codeAirport = codeAirport;
        this.idTown = idTown;
        this.adult = adult;
        this.enfant = enfant;
        this.bebe = bebe;
        this.prix = prix;
        this.username = username;
        this.idCategorie = idCategorie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(LocalDate dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getCodeAirport() {
        return codeAirport;
    }

    public void setCodeAirport(String codeAirport) {
        this.codeAirport = codeAirport;
    }

   

    public long getIdTown() {
        return idTown;
    }

    public void setIdTown(long idTown) {
        this.idTown = idTown;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getEnfant() {
        return enfant;
    }

    public void setEnfant(int enfant) {
        this.enfant = enfant;
    }

    public int getBebe() {
        return bebe;
    }

    public void setBebe(int bebe) {
        this.bebe = bebe;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public long getIdCategorie() {
        return idCategorie;
    } 

    public void setIdCategorie(long idCategorie) {
        this.idCategorie = idCategorie;
    }
    
    
     
}


