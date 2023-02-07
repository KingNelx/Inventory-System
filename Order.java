public class Order {

  private int orderID;
  private String orderedProduct;
  private int orderQuantity;
  private String emptySpace = " ";

  private static final String MSG_NEGATIVE_NUMBER_DETECTED =
    " Negative Number Detected ";
  private static final String MSG_SRTING_EMPTY = " Empty String Detected ";

  public void setOrderID(int orderID) {
    if (orderID < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_NUMBER_DETECTED);
    } else {
      this.orderID = orderID;
    }
  }

  public void setOrderedProduct(String orderedProduct) {
    if (orderedProduct == null || orderedProduct.equals(emptySpace)) {
      throw new IllegalArgumentException(MSG_SRTING_EMPTY);
    }
    if (orderedProduct.isEmpty()) {
      throw new IllegalArgumentException(MSG_SRTING_EMPTY);
    } else {
      this.orderedProduct = orderedProduct;
    }
  }

  public void setOrderQuantity(int orderQuantity) {
    if (orderQuantity < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_NUMBER_DETECTED);
    } else {
      this.orderQuantity = orderQuantity;
    }
  }

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
