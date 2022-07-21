public class Item {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return this.name;
    }
    public Item setName (String name) {
        this.name = name;
        return this;
    }
    public double getPrice() {
        return this.price;
    }
    public Item setPrice (double price) {
        this.price = price;
        return this;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public Item setQuantity (int qunatity) {
        this.quantity = qunatity;
        return this;
    }
}
