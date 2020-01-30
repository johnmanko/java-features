/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnmanko.example.javafeatures.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author john
 */
public class Student {
    
    private Date birthDate;
    private BigDecimal gpa;
    private String name;
    private String state;
    private YearLevelType yearLevel;
    
    public Student() {
        
    }
    
    public Student(String name, String state, String birthDate, String gpa, YearLevelType yearLevel) {
        this.birthDate = Date.from(LocalDate.parse(birthDate).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        this.name = name;
        this.state = state;
        this.gpa = new BigDecimal(gpa);
        this.yearLevel = yearLevel;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the gpa
     */
    public BigDecimal getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(BigDecimal gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the yearLevel
     */
    public YearLevelType getYearLevel() {
        return yearLevel;
    }

    /**
     * @param yearLevel the yearLevel to set
     */
    public void setYearLevel(YearLevelType yearLevel) {
        this.yearLevel = yearLevel;
    }
}
