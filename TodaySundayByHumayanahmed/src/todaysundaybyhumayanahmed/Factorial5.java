

package todaysundaybyhumayanahmed;

import java.util.Scanner;

public class Factorial5 {
    
    public static void main(String[] args) {
//        
//        int factorial =1;
//        
//        for(int i =1; i<=5; i++){
//            
//            factorial *=i;
//        }
//        System.out.println("Factorial of 5 is "+ factorial);

             int factorial =1;
             
   Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        
        int input =scanner.nextInt( );
        
         for(int i =1; i<=input; i++){
           
           factorial *= i;
      }
       System.out.println("Factorial of 5 is "+ factorial);
    }
    
}
