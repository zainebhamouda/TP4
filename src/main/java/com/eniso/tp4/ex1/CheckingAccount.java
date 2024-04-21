/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author zaine
 */
public class CheckingAccount extends BankAccount {
    
    private Double overdraftAllowed;
    
    public CheckingAccount(Integer accountNumber, Double balance,Double overdraftAllowed){
        
        super( accountNumber, balance);
        this.overdraftAllowed=overdraftAllowed;
    
    }

    public Double getOverdraftAllowed() {
        return overdraftAllowed;
    }

    public void setOverdraftAllowed(Double overdraftAllowed) {
        this.overdraftAllowed = overdraftAllowed;
    }
    
    @Override
    public void withdraw(double montant) {
        if (balance - montant < -overdraftAllowed) {
            System.out.println("Le montant du retrait dépasse la limite de découvert autorisée.");
        } else {
            balance -= montant;
        }
    }
    
    
    
}
