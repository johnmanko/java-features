/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnmanko.example.javafeatures.util;

import com.johnmanko.example.javafeatures.entities.Student;
import com.johnmanko.example.javafeatures.entities.Vehicle;
import com.johnmanko.example.javafeatures.entities.YearLevelType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author john
 */
public class EntityBuilder {
    
    public static List<Vehicle> initVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Vehicle(1990, "Ford", "F-150"));
        vehicles.add(new Vehicle(2001, "Ford", "F-150"));
        vehicles.add(new Vehicle(2002, "Ford", "F-150"));
        vehicles.add(new Vehicle(2003, "Ford", "F-150"));
        
        vehicles.add(new Vehicle(1994, "Ford", "F-250"));
        vehicles.add(new Vehicle(1995, "Ford", "F-250"));
        vehicles.add(new Vehicle(1996, "Ford", "F-250"));
        
        vehicles.add(new Vehicle(2018, "Ford", "Mustang"));
        vehicles.add(new Vehicle(2019, "Ford", "Mustang"));
        vehicles.add(new Vehicle(2020, "Ford", "Mustang"));

        vehicles.add(new Vehicle(2001, "BMW", "325xi"));
        vehicles.add(new Vehicle(2002, "BMW", "325xi"));
        vehicles.add(new Vehicle(2003, "BMW", "330xi"));
        vehicles.add(new Vehicle(2004, "BMW", "330xi"));
        
        vehicles.add(new Vehicle(2001, "Jeep", "Wrangler Unlimited"));
        vehicles.add(new Vehicle(2002, "Jeep", "Wrangler Unlimited"));
        vehicles.add(new Vehicle(2003, "Jeep", "Wrangler Unlimited"));
        
        return vehicles;
                
    }
    
    
    public static List<Student> initStudents() {        
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("John Smith", "NJ", "2000-01-12", "2.91", YearLevelType.JUNIOR));
        students.add(new Student("Jane Doe", "FL", "1999-02-14", "4.0", YearLevelType.SENIOR));
        students.add(new Student("Chris Johnson", "CO", "2000-03-09", "3.45", YearLevelType.JUNIOR));
        students.add(new Student("Gilly Clark", "VT", "1998-04-23", "3.12", YearLevelType.SENIOR));
        students.add(new Student("Marthy Jones", "PA", "2001-05-24", "3.23", YearLevelType.SOPHOMORE));
        students.add(new Student("Larry Turly", "NM", "2000-06-30", "2.69", YearLevelType.JUNIOR));
        students.add(new Student("Jasper O'Conner", "WY", "2001-07-12", "3.92", YearLevelType.SOPHOMORE));
        students.add(new Student("Barry Clipper", "CA", "1999-08-18", "2.98", YearLevelType.SENIOR));
        students.add(new Student("Franklin Mitler", "ND", "2002-09-04", "3.65", YearLevelType.FRESHMAN));
        
        return students;
    }
    
}
