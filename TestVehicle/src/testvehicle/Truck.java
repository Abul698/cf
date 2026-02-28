
package testvehicle;

public class Truck extends Vehicle{
    
    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
       
        if (weight>2000){
        regularPrice= regularPrice-(regularPrice*.10);
        return regularPrice;
        }else{
        return regularPrice;
        }
    }
    
    
}
