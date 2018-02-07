import java.util.Arrays;

public class GroceryList {
    private GroceryItemOrder[] groceryItemOrders;
    private int size;

    public GroceryList() {
        this.groceryItemOrders = new GroceryItemOrder[10];
    }

    public void add(GroceryItemOrder item) {
        if (size >= this.groceryItemOrders.length) {
            System.out.println("List is full");
            System.out.println();
            return;
        }
        for (int i = 0; i < this.groceryItemOrders.length; i++) {
            if (this.groceryItemOrders[i] == null) {
                this.groceryItemOrders[i] = item;
                this.size++;
                return;
            }
        }
    }

    public double getTotalCost() {
        double sum = 0;
        for (GroceryItemOrder item:this.groceryItemOrders) {
            sum = sum + item.getCost();
        }
        return sum / 100;
    }

    @Override
    public String toString() {
        return "GroceryList (Array)" + Arrays.toString(groceryItemOrders) +
                "\n\nTOTAL: DKK " + getTotalCost() + "\n";
    }
}
