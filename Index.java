public class Index {

  public static void main(String[] args) {
    Product product = new Product(
      1,
      "Keyboard",
      1,
      850,
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
  }
}
