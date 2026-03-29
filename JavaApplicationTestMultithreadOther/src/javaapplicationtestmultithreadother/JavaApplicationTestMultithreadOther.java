
package javaapplicationtestmultithreadother;

public class JavaApplicationTestMultithreadOther {

   
    public static void main(String[] args) {
      
        Runnable printA =new PrintChar('A', 10);
        Runnable printB =new PrintChar('B', 9);
        Runnable printC =new PrintChar('C', 8);
        
        Thread t1 =new Thread(printA);
        Thread t2 =new Thread(printB);
        Thread t3 =new Thread(printC);
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
