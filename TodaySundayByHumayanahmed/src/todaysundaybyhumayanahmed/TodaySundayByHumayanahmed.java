
package todaysundaybyhumayanahmed;

import java.util.Scanner;

public class TodaySundayByHumayanahmed {

  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        
        int input =scanner.nextInt();
        int sum=0;
        
        while(input>=0){
        sum +=input;
            System.out.println("Enter the Number");
            input=scanner.nextInt();
              
    }
    scanner.close();
        System.out.println("sum is" + sum);

    }
}
