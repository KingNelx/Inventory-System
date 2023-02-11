public class Order {

  private int orderID;
  private Product product;
  private int quantity;
  private static final String MSG_NEGATIVE_NUM = " Negative Number detected ";

  public Order(int orderID, Product product, int quantity) {
    setOrderID(orderID);
    this.product = product;
    setQuantity(quantity);
  }

  public int getOrderID() {
    return orderID;
  }

  public void setOrderID(int orderID) {
    if (orderID < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_NUM);
    } else {
      this.orderID = orderID;
    }
  }

  public Product getProduct() {
    return product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_NUM);
    } else {
      this.quantity = quantity;
    }
  }
}
/*
 Create an Order class: This class will represent a single order and 
 should have properties such as id, product, and quantity.
 */
