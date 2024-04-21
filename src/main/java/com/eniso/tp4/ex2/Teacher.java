/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author zaine
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends User{

    private Long hIndex;
    private List<Course> courses;

    public Teacher(String firstName, String lastName, String email, Long cin,Long hIndex, List<Course> courses) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    
    
    
    @Override
    public String displayInfo(){
    
         return(super.displayInfo()+"index="+this.hIndex+"list cours="+this.courses);
    
    }
    public void updateProfile(String firstName,String lastName,String email,Long cin,Long hIndex,List<Course> courses){
        super.updateProfile(firstName, lastName, email, cin);
        this.hIndex=hIndex;
        this.courses=courses;
        
       
    }
    @Override
    public boolean authenticate(){
        
        return true;
    }
       public void displayCoursesContent() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getName());
            System.out.println("Contents: " + course.getContents());
            System.out.println("Coefficient: " + course.getCoef());
        }
    }

    void setHIndex(long l) {
        this.hIndex=l; 
    }

    
    
    
    
    

   
    

    
    
    
}
