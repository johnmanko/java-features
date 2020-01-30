/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnmanko.example.javafeatures.util;

/**
 *
 * @author john
 */
public class Logger {
    
    static String headerFooter = "*****************************\n*****      %s        *****\n*****************************";
    
    public static void begin() {
        log(String.format(headerFooter, "BEGIN"));
    }
    
    public static void end() {
        log(String.format(headerFooter, " END "));
    }
    
    public static void log(String text) {
        System.out.println(text);
    }
    
}
