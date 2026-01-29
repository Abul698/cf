/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationfactorial;

import java.util.Scanner;


public class JavaApplicationFactorial {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
     System.out.println("Enter Number");
       
       int number = input.nextInt();
       int count = 1;
       int  i = 1;
      
       while(i<=number){
           count=count*i;
           i++;
       }
        
        System.out.println(count);
    }
}

//          int num = 19; 
//        int factorial = 1;
//        int i = 1;
//
//        while (i <= num) {
//            factorial *= i; 
//            i++; 
//        }
//
//        System.out.println("Factorial " + num + " is " + factorial);
//    }
//}
//    
    

