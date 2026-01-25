
package javaapplication3;

import java.awt.BorderLayout;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        
        System.out.println("Enter second");
        int second = input.nextInt();
        
        int minutes = second / 60;
        int secondasfd = second % 60;
        
//        String minMessage = "Minute";
//            if (minutes >1){
//              minMessage = "Minutes";
//            }else{
//                minMessage = "Minute";}
//                
        System.out.println(minutes+" minutes "+ " Abul "+ secondasfd+" seconds");
                
            
        
    }
    
}
