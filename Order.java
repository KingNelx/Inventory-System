public class Order {

  private int orderID;
  private String orderedBy;
  private Product productOrder;
  private String emptyString = " ";

  public Order(int orderID, String orderBy, Product productOrder) {
    setOrderID(orderID);
    setOrderedBy(orderBy);
    setProductorder(productOrder);
  }

  private static final String ERROR_MSG_NUMBER_NEGATIVE =
    " Negative Number Detected ";
  private static final String ERROR_MSG_STRING_NULL = " Null Detected ";
  private static final String ERROR_MSG_STRING_EMPTY =
    " Empty String Detected ";
  private static final String ERROR_MSG_NOT_RECOGNIZE = " Object not recognize as part of the class ";

  public void setOrderID(int orderID) {
    if (orderID < 0) {
      throw new IllegalArgumentException(ERROR_MSG_NUMBER_NEGATIVE);
    }
    this.orderID = orderID;
  }

  public int getOrderID() {
    return orderID;
  }

  public void setProductorder (Product productOrder) {
    if (!(productOrder instanceof Product)){
        throw new IllegalArgumentException(ERROR_MSG_NOT_RECOGNIZE);
    }
    this.productOrder = productOrder;
  }
  public Product getProductOrder() {
    return productOrder;
  }
  public void setOrderedBy(String orderedBy) {
    if (orderedBy == null) {
      throw new IllegalArgumentException(ERROR_MSG_STRING_NULL);
    } else if (
      orderedBy.trim().isEmpty() || orderedBy.equalsIgnoreCase(emptyString)
    ) {
      throw new IllegalArgumentException(ERROR_MSG_STRING_EMPTY);
    }
    this.orderedBy = orderedBy;
  }

  public String getOrderBy() {
    return orderedBy;
  }
}
