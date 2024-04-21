/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author zaine
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount account = new SavingsAccount(201, 0.0, 3.5);
        SavingsAccount savingsAccount = (SavingsAccount) account;
        System.out.println("Conversion explicite réussie : " + (savingsAccount != null));

        BankAccount anotherAccount = new CheckingAccount(202, 0.0, 1000.0);
        CheckingAccount checkingAccount = (CheckingAccount) anotherAccount;
        System.out.println("Conversion explicite réussie : " + (checkingAccount != null));

        SavingsAccount savingsAccount1 = new SavingsAccount(101, 0.0, 5.0);
        savingsAccount1.deposit(1000.0);
        savingsAccount1.withdraw(200.0);
        System.out.println("Solde du compte épargne : " + savingsAccount1.getBalance());

        CheckingAccount checkingAccount1 = new CheckingAccount(102, 0.0, 500.0);
        checkingAccount1.deposit(1500.0);
        checkingAccount1.withdraw(800.0);
        System.out.println("Solde du compte chèque : " + checkingAccount1.getBalance());

        Customer customer = new Customer("John", "Doe");
        customer.addAccount(savingsAccount1);
        customer.addAccount(checkingAccount1);
        System.out.println("Solde total du client : " + customer.getTotalAccountBalance());

        Bank bank = new Bank();
        bank.addCustomer(customer);
        System.out.println("Solde total de la banque : " + bank.getTotalBalance());

        
        
        
    }
    
}
