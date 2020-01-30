/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnmanko.example.javafeatures;

import com.johnmanko.example.javafeatures.entities.Vehicle;
import com.johnmanko.example.javafeatures.util.EntityBuilder;
import com.johnmanko.example.javafeatures.util.Logger;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author john
 */
public class ListStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logger.begin();
        
        List<Vehicle> vehicles = EntityBuilder.initVehicles();
        
        if (!vehicles.stream().anyMatch((vehicle) -> vehicle.getMake().equalsIgnoreCase("Chevy"))) {
            Logger.log("There are no Chevy vehicles");            
        }
        
        Logger.log(
                String.format(
                        "There are %d Jeep(s)", 
                        vehicles.stream()
                                .filter((vehicle) -> vehicle.getMake().equalsIgnoreCase("Jeep")).count()
                )
        );
        
        Logger.log("These are the only BMWs:");
        vehicles.stream()
                .filter((vehicle) -> vehicle.getMake().equalsIgnoreCase("BMW"))
                .forEach((vehicle) -> System.out.println(vehicle));
        
        List<String> fordTypes = vehicles.stream().filter((vehicle) -> vehicle.getMake().equalsIgnoreCase("Ford")).map((vehicle) -> vehicle.getModel()).distinct().collect(Collectors.toList());

        Logger.log(
                String.format(
                        "There are %d types of Ford models: %s", 
                        fordTypes.size(),
                        String.join(", ", fordTypes)
                )
        );
        
        Logger.end();
    }
    
}
