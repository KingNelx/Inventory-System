public class Order {

  private int orderID;
  private String orderedProduct;
  private int orderQuantity;

  private static final String MSG_NEGATIVE_NUMBER_DETECTED =
    " Negative Number Detected ";

  public void setOrderID(int orderID) {

    if (orderID < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_NUMBER_DETECTED);
    } else {
      this.orderID = orderID;
    }
    
  }

  public void setOrderedProduct() {}

  public void setOrderQuantity() {}

  public int getOrderID() {
    return orderID;
  }

  public String getOrderedProduct() {
    return orderedProduct;
  }

  public int getOrderQuantiy() {
    return orderQuantity;
  }
}
