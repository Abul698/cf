
package javaapplicationguessnumber;

import java.util.Scanner;

public class JavaApplicationGuessNumber {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int randomNumber =(int)(Math.random()*10);
        
        System.out.println(randomNumber);
        
        int chance = 3;
        boolean win = false;
        System.out.println("Guess a number between 0-9");
        while (chance >=1){
            
            System.out.println("Enter your guess(" +chance+ " chances left): ");
            int guessNumber= input.nextInt();
            
            if    (guessNumber ==randomNumber)  {               
                    System.out.println("you win");
                    win = true;
               
            } else if  (guessNumber >randomNumber) {
                System.out.println("number larger");
                System.out.println("number larger");
                guessNumber =input.nextInt();
            
            }else if  (guessNumber <randomNumber) {
                System.out.println("your number smaller");
                System.out.println("Enter your guess number");
                guessNumber =input.nextInt();
            }
  chance--;
        }
        System.out.println("you lost guess number "+randomNumber);
    
}}
