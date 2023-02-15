public class Index {

  public static void main(String[] args) {
    Product product = new Product(
      1,
      "Keyboard",
      2,
      500,
      "Mechanical RGB Keyboard",
      "KingNelx"
    );

    Product product2 = new Product(
      2,
      "Mouse",
      1,
      760,
      "Red Dragon Mirage",
      "KingNelx"
    );
    Inventory inventory = new Inventory();
    inventory.addProduct(product);
    inventory.addProduct(product2);
    String res = inventory.showAllProducts();
    System.out.println(res);

    System.out.println(" Is product the same: " + product.areProductsEqual(product2));
    System.out.println(" Total Cost is: " + product.totalCost(product.getQuantity()));
    
  }
}
