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
    Inventory inventory = new Inventory();
    inventory.addProduct(product);
    String res = inventory.showAllProducts();
    System.out.println(String.format(res));
  }
}
