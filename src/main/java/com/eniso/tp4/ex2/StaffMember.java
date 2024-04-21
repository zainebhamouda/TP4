package com.eniso.tp4.ex2;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zaine
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StaffMember extends User {
    
  
    private String qualification;
    private Integer experience; 
    private List<String> tasks;

     public StaffMember(String firstName, String lastName, String email, Long cin, String qualification, Integer experience, List<String> tasks) {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }

    

    
    
    @Override
    public String displayInfo(){
    
         return(super.displayInfo()+"Qualification="+this.qualification+"Experience"+this.experience+"tasks="+this.tasks);
    
    }
    
    
    public void updateProfile(String firstName,String lastName,String email,Long cin,String q,Integer e,List<String> t){
        
        super.updateProfile(firstName, lastName, email, cin);
        this.experience=e;
        this.qualification=q;
        this.tasks=t;
    
    }
    @Override
    public boolean authenticate(){
        
        return true;
    }
       public void finishTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task '" + task + "' marked as finished.");
        } else {
            System.out.println("Task '" + task + "' not found.");
        }
    }
    
 
    
}
