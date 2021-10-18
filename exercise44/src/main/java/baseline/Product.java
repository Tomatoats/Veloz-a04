package baseline;

public class Product {
    String name;
    double price;
    int quantity;

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

}
