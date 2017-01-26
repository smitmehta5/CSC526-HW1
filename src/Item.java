/**
 * Created by Smit on 20-01-17.
 */
public class    Item {
    private String name; //"apple"
    private double price; // 0.99

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double priceFor(int quantity) {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", price);
    }
}
