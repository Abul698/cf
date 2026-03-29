
package javaapplicationrecurion;

import java.util.Scanner;

public class JavaApplicationRecurion {

    public static void main(String[] args) {
      
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Number");
        
       int number = input.nextInt();
       
       int result= factorial(number);
       
        System.out.println(result);
       
    }
    
    static int factorial(int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }
    
}
