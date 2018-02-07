import java.util.Arrays;

public class GroceryList {
    private GroceryItemOrder[] groceryItemOrders = new GroceryItemOrder[10];
    private int size;

    public void add(GroceryItemOrder item) {
        if (size >= this.groceryItemOrders.length) {
            System.out.println("List is full");
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

    public int getTotalCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "groceryItemOrders=" + Arrays.toString(groceryItemOrders) +
                ", size=" + size +
                '}';
    }
}
