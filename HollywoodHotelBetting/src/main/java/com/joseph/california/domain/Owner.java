/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;

/**
 *
 * @author BradleyJoseph
 */
@Embeddable
public class Owner implements Serializable{
    private String landline;
    private String address;
    private String cell;
    private Customer customer;
    
    public static class Builder {
        private Customer customer;
        private Long id;
        private String firstname;
        private String lastname;
        private int age;
        private String sex;
        private Contact contact;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }

        public Builder firstname(String value) {
            firstname = value;
            return this;
        }

        public Builder lastnaname(String value) {
            lastname = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Builder contact(Contact value) {
            contact = value;
            return this;
        }
        
        public Builder customer(Customer value) {
            customer = value;
            return this;
        }
              
            public Builder horse(Horse horse){
            id = horse.getId();
            firstname = horse.getFirstname();
            lastname = horse.getLastname();
            age = horse.getAge();
            sex = horse.getSex();
            contact = horse.getContact();
            return this;
            
        }
    }
    

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    
    
}
