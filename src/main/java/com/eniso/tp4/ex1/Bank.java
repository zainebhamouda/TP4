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
public class Bank {
    
    private ArrayList<Customer> clients;

    public Bank() {
        this.clients = new ArrayList();
    }
    
    public void addCustomer(Customer client){
       
        clients.add(client);
    
    }
    public void removeCustomer(Customer client){
    
        clients.remove(client);
    }
    public Double getTotalBalance() {
        Double totalBalance = 0.0;
        for (Customer client :clients ) {
            totalBalance += client.getTotalAccountBalance();
        }
        return totalBalance;
    }
}
