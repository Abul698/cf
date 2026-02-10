
package testjava.in;



public class Truck extends Vehicle{
    public int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return (weight > 2000)? super.regularPrice - super.regularPrice * 0.1: super.regularPrice;    }

    
    
     
    
    
}
