import java.util.ArrayList;

public class GroceryList2 {
    private ArrayList<GroceryItemOrder> groceryItemOrders;

    public GroceryList2() {
        this.groceryItemOrders = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        this.groceryItemOrders.add(item);
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
        return "GroceryList (ArrayList)" + groceryItemOrders +
                "\n\nTOTAL: DKK " + getTotalCost() + "\n";
    }
}