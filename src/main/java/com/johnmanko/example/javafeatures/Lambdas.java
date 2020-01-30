/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnmanko.example.javafeatures;

import com.johnmanko.example.javafeatures.entities.Student;
import com.johnmanko.example.javafeatures.entities.Vehicle;
import com.johnmanko.example.javafeatures.entities.YearLevelType;
import com.johnmanko.example.javafeatures.util.EntityBuilder;
import com.johnmanko.example.javafeatures.util.Logger;
import java.math.BigDecimal;
import java.util.function.Consumer;

/**
 *
 * @author john
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final BigDecimal goodGrade = new BigDecimal("3.5");
        
        Consumer<Student> gradeCheck = (s) -> {
            if (s.getGpa().compareTo(goodGrade) == -1) {
                Logger.log(String.format("oh no, %s! You need to pick up your grades!  %s isn't going to cut it in this competitive world.", s.getName(), s.getGpa().toString()));
            } else {
                Logger.log(String.format("Well, %s, %s is pretty good.  Keep up the great work!", s.getName(), s.getGpa().toString()));
            }
        };

        Logger.begin();

        doActionOnStudents((s) -> {
            if (s.getYearLevel() == YearLevelType.SENIOR) {
                Logger.log(String.format("Get ready to graduate, %s!!!!!", s.getName()));
            } else {
                Logger.log(String.format("Not so fast, %s!  As a %s, you still need to study hardy!", s.getName(), s.getYearLevel().name()));
            }
        });

        doActionOnStudents(gradeCheck);

        doActionOnVehicles(Lambdas::processVehicle);

        Logger.end();
    }

    private static void processVehicle(Vehicle v) {
        if (v.getYear() < 2017) {
            Logger.log(String.format("Will you be trading in your %s?", v.toString()));
        } else {
            Logger.log(String.format("How do you like your %s?", v.toString()));
        }
    }

    private static void doActionOnStudents(Consumer<Student> f) {
        EntityBuilder.initStudents().forEach((student) -> f.accept(student));
    }

    private static void doActionOnVehicles(Consumer<Vehicle> f) {
        EntityBuilder.initVehicles().forEach((student) -> f.accept(student));
    }

}
