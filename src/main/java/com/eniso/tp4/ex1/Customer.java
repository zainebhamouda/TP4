/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

import java.util.ArrayList;

/**
 *
 * @author zaine
 */
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts =new ArrayList();
    }
    
    
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void removeAccount(BankAccount account) {
        accounts.remove(account);
    }

    public Double getTotalAccountBalance() {
        Double totalBalance = 0.0;
        for (BankAccount account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, Double amount) {
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
    }
}
