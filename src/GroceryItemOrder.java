public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double price;

    public GroceryItemOrder(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public GroceryItemOrder(String name) {
        this.name = name;
        this.quantity = 1;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "GroceryItemOrder{" +
                "name='" + this.name + '\'' +
                ", quantity=" + this.quantity +
                ", cost=" + this.getCost() +
                '}';
    }
}
