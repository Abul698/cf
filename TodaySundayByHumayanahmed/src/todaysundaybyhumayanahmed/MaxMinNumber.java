
package todaysundaybyhumayanahmed;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        int numbers[]=new int[5];
        
        for (int index =0; index<numbers.length; index++){
            System.out.println("Enter number");
            numbers[index] = s.nextInt();
        }
        System.out.println("All Numbers:" + Arrays.toString(numbers));
        
        int max = numbers[0];
        int min = numbers[0];
        
        for (int index = 1; index<numbers.length;index++){
        if (numbers[index]>max){
        max = numbers[index];
        }
        if (numbers[index]<min){
        min = numbers[index];
        }
          
        }
         System.out.println("max"+max);
            System.out.println("max"+min); 
    }
}
