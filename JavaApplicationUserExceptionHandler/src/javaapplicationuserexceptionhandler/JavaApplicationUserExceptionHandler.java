
package javaapplicationuserexceptionhandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.event.PrintEvent;

public class JavaApplicationUserExceptionHandler {

    private static int s;

    
    
  
    public static void main(String[] args) {
     
        File file = new File("C:\\Users\\Admin\\Desktop\\Bhpd.txt");
        
        try {
            
           
            
            PrintWriter pw = new PrintWriter(file);
//            
//         pw.write("i |n" );
//         pw.println("Hello Badrul  " );
//         pw.println("Hello Badrul  " );
//         pw.write("Hello Badrul  " );
         
                for (int i = 1; i <= 100; i++) {
           pw.println(i);
                }
         
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplicationUserExceptionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
