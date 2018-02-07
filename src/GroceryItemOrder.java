public class GroceryItemOrder {
    private String name;
    private int quantity;
    private int price;

    public GroceryItemOrder(String name, int quantity, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "\n\n" + this.name +
                "\nAmount: " + this.quantity +
                "\nDKK " + (((double) this.getCost()) / 100);
    }
}
