package com.sgaidai.springhibernate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mobiller")

public class Friend implements Serializable {
    
    
    
    @Column(name="fname")
    private String fname;
    
    @Column(name="name")
    private String name;
    
    @Id
    @Column(name="mobil")
    private String mobile;
    
    @Column(name="date")
    private String date;
 
    public Friend (int numb, String fname, String name, String mobile, String date) {
        this.fname = fname;
        this.name = name;
        this.mobile = mobile;
        this.date = date;
    }
    public Friend (){
    }

    

    public void setName(String name) {
        this.name = name;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setDate(String date) {
        this.date = date;
    }
    

    public String getFname() {
        return fname;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }
    
    public String getDate() {
        return date;
    }
}
