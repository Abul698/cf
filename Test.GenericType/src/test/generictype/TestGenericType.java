
package test.generictype;

import entity.Student;
import java.lang.reflect.Array;
import java.util.ArrayList;
import jdk.jfr.StackTrace;

public class TestGenericType {
    public static void main(String[] args) {
        
        ArrayList<Student> sList=new ArrayList<>();
        
        Student s =new Student(12,"Tanvir", "tanvir@gmail.com");
    
        Student s1 =new Student();
        s1.setId(13);
        s1.setName("Faruk");
        s1.setEmail("faruk@gmail.com");
        
        sList.add(new Student(10, "Emon", "emon@gmail.com"));
        sList.add(new Student(11, "Pk", "pk@gmail.com"));
        sList.add(s);
        
        System.out.println(sList);
    }
    
}
