public class Product {

  private int productID;
  private String productName;
  private double productPrice;

  public Product(int productID, String productName, double productPrice) {

    if (productID <= 0) {
        throw new IllegalArgumentException(" Negative ");
      } else {
        this.productID = productID;
      }
  }
}
