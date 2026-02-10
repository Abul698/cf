
package testjava.in;


public class Vehicle {
    public int speed;
    public double regularPrice;
    public String color;

    public Vehicle() {
        
        
        
    }

    public Vehicle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    public double getPrice(){
        return regularPrice;
    }
    
    
    }
    
    

