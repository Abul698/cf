
package testmultithreading;

public class TestMultiThreading {

    
    public static void main(String[] args) {
        
        Runnable printA  =new PrintChar("Biscit ", 20);
        Runnable printB  =new PrintChar("Bananna", 20);
        Runnable printP =new PrintChar("Juice", 20);
        
        Thread t1=new Thread(printA);
        Thread t2=new Thread(printB);
        Thread t3=new Thread(printP);
        
        t1.start();
        t2.start();
        t3.start();
        
        
    }
    
}
