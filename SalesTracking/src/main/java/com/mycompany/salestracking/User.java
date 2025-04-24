/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salestracking;

/**
 *
 * @author Monster Huma H5 v4.1
 */
public class User {
    static String person;
    String name_surname;
    String address;
    String email;
    char[] password;
    Gender gender; 
    
    enum Gender{
        male,
        female,
        notSelected,
    }
    
    
    public User(String name_surname, String address, String email, char[] password, Gender gender) throws Exception{
        if(name_surname.isEmpty() || address.isEmpty()|| email.isEmpty() || password.equals("") || gender==Gender.notSelected){
            throw new EmptyAreaException();
        }
        this.name_surname = name_surname;
        this.address = address;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }
    
    public static void setName(String name){
        User.person = name;
    }
    
    public static String getName(){
        return User.person;
    }
}
