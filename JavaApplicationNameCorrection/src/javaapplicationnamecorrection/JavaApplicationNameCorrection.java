/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationnamecorrection;

import java.util.Scanner;


public class JavaApplicationNameCorrection {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Your name");
        
        String name = input.next();
        
        String firstChar = name.substring(0,1).toUpperCase();
        String lastPart = name.substring(1).toLowerCase();
                
        String newName = firstChar + lastPart;
        
        System.out.println(newName);
    }
    
}
