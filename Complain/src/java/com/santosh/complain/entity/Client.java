/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.complain.entity;

/**
 *
 * @author santosh
 */
public class Client {
    private int id;
    private String firstName,lastName,email;

    public Client() {
    }

    public Client(int id, String firstNane, String lastName, String email) {
        this.id = id;
        this.firstName = firstNane;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstNane() {
        return firstName;
    }

    public void setFirstName(String firstNane) {
        this.firstName = firstNane;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
