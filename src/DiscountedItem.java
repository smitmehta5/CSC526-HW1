/**
 * Created by Smit on 20-01-17.
 */
public class DiscountedItem { // extends Item  {
    private String name;
    private double Price;
    private int bulkQuantity;
    private double bulkPrice;

    public DiscountedItem(String name, double Price, int bulkQuantity, double bulkPrice){
        this.name = name;
        this.Price = Price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;

    }

    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", Price) + "(" + bulkQuantity + " for $" + String.format("%.2f", bulkPrice + ")") ;
    }
    @Override
    public double priceFor() {
        return priceFor(int quantity) {
    }

}
