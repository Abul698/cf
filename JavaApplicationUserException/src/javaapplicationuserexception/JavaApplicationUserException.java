
package javaapplicationuserexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplicationUserException {

    public static void main(String[] args) {
      
        File file = new File("C:\\Users\\Admin\\Desktop\\Bhpd.txt" );
        
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello");
            pw.println("Bye");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplicationUserException.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            Scanner s = new Scanner(file);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplicationUserException.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
