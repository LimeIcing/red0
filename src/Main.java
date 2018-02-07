public class Main {
    public static void main(String[] args) {
        GroceryItemOrder bananaOrg = new GroceryItemOrder("Organic Banana",10,300);
        GroceryItemOrder broccoliOrg = new GroceryItemOrder("Organic Broccoli",1,1000);
        GroceryItemOrder trashBags20L = new GroceryItemOrder("Trash Bags, 20 l",3,1000);
        GroceryItemOrder tampons = new GroceryItemOrder("Tampax",3,3332);
        GroceryItemOrder baguetteWholegrain = new GroceryItemOrder("Wholegrain Baguettes",1,395);
        GroceryItemOrder appleRoyalGala = new GroceryItemOrder("Royal Gala",10,300);
        GroceryItemOrder kiwiOrg = new GroceryItemOrder("Organic Kiwi",10,300);
        GroceryItemOrder orangeSmallOrg = new GroceryItemOrder("Organic Small Orange",10,300);
        GroceryItemOrder bellPepperYellowOrg = new GroceryItemOrder("Organic Yellow Bell Pepper",2,750);
        GroceryItemOrder tomatoes = new GroceryItemOrder("Tomatoes",1,1500);
        GroceryItemOrder blueberriesOrg = new GroceryItemOrder("Organic Blueberries",1,1500);
        GroceryList groceryArray = new GroceryList();
        GroceryList2 groceryList = new GroceryList2();

        groceryArray.add(baguetteWholegrain);
        groceryArray.add(bellPepperYellowOrg);
        groceryArray.add(kiwiOrg);
        groceryArray.add(appleRoyalGala);
        groceryArray.add(orangeSmallOrg);
        groceryArray.add(tomatoes);
        groceryArray.add(bananaOrg);
        groceryArray.add(broccoliOrg);
        groceryArray.add(trashBags20L);
        groceryArray.add(tampons);

        System.out.println(groceryArray);

        groceryArray.add(blueberriesOrg);

        groceryList.add(baguetteWholegrain);
        groceryList.add(bellPepperYellowOrg);
        groceryList.add(kiwiOrg);
        groceryList.add(appleRoyalGala);
        groceryList.add(orangeSmallOrg);
        groceryList.add(tomatoes);
        groceryList.add(bananaOrg);
        groceryList.add(broccoliOrg);
        groceryList.add(trashBags20L);
        groceryList.add(tampons);

        System.out.println(groceryList);

        groceryList.add(blueberriesOrg);
    }
}
