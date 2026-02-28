
package testvehicle;

public class Vehicle {
    int spreed;
    double regularPrice;
    String color;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    double getSalePrice(){
    return regularPrice;
    }
   
}
