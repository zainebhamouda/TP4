/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author zaine
 */
public class SavingsAccount extends BankAccount{
    
    private Double interestRate;

    public SavingsAccount(Integer accountNumber, Double balance ,Double interestRate) {
        
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    public Double calculateInterest(){
        
        return(super.balance += super.balance * (interestRate / 100));
    
        
    }
    public Double getInterestRate() {
        return interestRate;
    }
    
    @Override
    public void withdraw(double montant) {
        if (montant > balance) {    
            System.out.println("Le montant du retrait dépasse le solde.");
        } else { 
            balance -= montant;
            if (balance < 0) {    
                balance -= 50; // pénalité pour les découverts
            }
        }
    }
    
    
}
