/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author zaine
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class User {
    String firstName;
    private String lastName;                
    private String email;
    private Long cin;
    
    public String displayInfo(){
        return("First name="+this.firstName+"last name"+this.lastName+"email"+this.email+"cin="+this.cin);
    
    }
    public void updateProfile(String firstName,String lastName,String email,Long cin){
        
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.cin=cin;

    
    }
    public boolean authenticate(){
        
        return true;
    }
    
}
