/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnmanko.example.javafeatures.entities;

/**
 *
 * @author john
 */
public class Vehicle {
    
    private Integer year;
    private String make;
    private String model;   
    
    public Vehicle() {
        
    }
    
    public Vehicle(Integer year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }
    

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public String toString() {
        return String.format("%d %s %s", this.year, this.make, this.model);
    }
}
