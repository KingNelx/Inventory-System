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

    inventory.updateProductByID(
      product,
      1,
      "Gaming Ultimate Keyboard",
      900,
      "GAMING RGB ULTI KEYBOARD",
      "CHINA"
    );
    System.out.println(res);
  }
  /*
   *  Product product,
    int productID,
    String productName,
    double price,
    String description,
    String supplier
   */
}
