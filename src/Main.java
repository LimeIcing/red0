public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        String[] names = fh.readFromFile("names.txt");
        GroceryItemOrder bananaOrg = new GroceryItemOrder(names[0],10,300);
        GroceryItemOrder broccoliOrg = new GroceryItemOrder(names[1],1,1000);
        GroceryItemOrder trashBags20L = new GroceryItemOrder(names[2],3,1000);
        GroceryItemOrder tampons = new GroceryItemOrder(names[3],3,3332);
        GroceryItemOrder baguetteWholegrain = new GroceryItemOrder(names[4],1,395);
        GroceryItemOrder appleRoyalGala = new GroceryItemOrder(names[5],10,300);
        GroceryItemOrder kiwiOrg = new GroceryItemOrder(names[6],10,300);
        GroceryItemOrder orangeSmallOrg = new GroceryItemOrder(names[7],10,300);
        GroceryItemOrder bellPepperYellowOrg = new GroceryItemOrder(names[8],2,750);
        GroceryItemOrder tomatoes = new GroceryItemOrder(names[9],1,1500);
        GroceryItemOrder blueberriesOrg = new GroceryItemOrder(names[10],1,1500);
        GroceryList groceryArray = new GroceryList();
        GroceryList2 groceryList = new GroceryList2();

        names[0] = bananaOrg.getName();
        names[1] = broccoliOrg.getName();
        names[2] = trashBags20L.getName();
        names[3] = tampons.getName();
        names[4] = baguetteWholegrain.getName();
        names[5] = appleRoyalGala.getName();
        names[6] = kiwiOrg.getName();
        names[7] = orangeSmallOrg.getName();
        names[8] = bellPepperYellowOrg.getName();
        names[9] = tomatoes.getName();
        names[10] = blueberriesOrg.getName();

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
