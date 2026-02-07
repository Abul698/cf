
package javaapplicationprimenumber;

import java.util.Scanner;
import javax.crypto.AEADBadTagException;
import javax.xml.transform.Source;

public class JavaApplicationPrimeNumber {

    public static void main(String[] args)
   
    {Scanner input = new Scanner(System.in);
    System.out.println("Enter the Number");
       
        int num = input.nextInt();

        int count=0;
        
for (int i = 1;i <= num; i++) {
  if (num % i == 0) {
   count+=1;
  }
  if(count==2){
System.out.println(" prime" );
                
}else{
      System.out.println("not prime");
  }
}
    }}
    

