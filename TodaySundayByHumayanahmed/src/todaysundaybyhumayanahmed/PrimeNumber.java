
package todaysundaybyhumayanahmed;

import java.util.Scanner;
import javax.swing.InputMap;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        
        int num= scanner.nextInt();
        
        if (num%2==0){
            System.out.println("Prime");
        }
        else{
          System.out.println("Not Prime");
        }
      
    }
}



