public class Index {

  public static void main(String[] args) {
    Product myProd = new Product(1, "Gaming Mouse", 700, "Red Dragon Mirage");
    Order myOrder = new Order(1, myProd, 2);
    Inventory mInventory = new Inventory(myProd, myOrder);

    System.out.print(mInventory.printOrders(myProd));
  }
}
