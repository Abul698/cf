
package binaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryIO {

    public static void main(String[] args) {
      
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Bhpd.txt");
            for (int i =1; i<=10; i++){
            output.write(i);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\Bhpd.txt");
            int value;
            while ((value =input.read()) !=-1) {
                System.out.println(value+" ");
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
