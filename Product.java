interface productPricing {
  public double totalProductCost(int quantity);
  public boolean isSameProduct(Product other);
}

public class Product implements productPricing{

  private int productID;
  private String productName;
  private String shipFrom;
  private double price;

  private static final String emptyString = " ";
  private static final String MSG_STRING_EMPTY = " Empty String Detected ";
  private static final String MSG_NEGATIVE_DETECTED =
    " Negative Number Detected ";
  private static final String MSG_STRING_NULL = " Null Detected ";

  public Product(
    int productID,
    String productName,
    String shipFrom,
    double price
  ) {
    setProductID(productID);
    setProductName(productName);
    setShipFrom(shipFrom);
    setProductPrice(price);
  }

  @Override
  public double totalProductCost(int quantity) {
    return this.price * quantity;
  }

  @Override
  public boolean isSameProduct(Product sameProd) {
    return this.productID == sameProd.getProductID();
  }

  public void setProductID(int productID) {
    if (productID < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_DETECTED);
    }
    this.productID = productID;
  }
  public int getProductID() {
    return productID;
  }

  public void setProductName(String productName) {
    if (productName == null) {
      throw new IllegalArgumentException(MSG_STRING_NULL);
    } else if (
      productName.trim().isEmpty() || productName.equalsIgnoreCase(emptyString)
    ) {
      throw new IllegalArgumentException(MSG_STRING_EMPTY);
    }
    this.productName = productName;
  }

  public String getProductName() {
    return productName;
  }

  public void setShipFrom(String shipFrom) {
    if (shipFrom == null) {
      throw new IllegalArgumentException(MSG_STRING_NULL);
    } else if (
      shipFrom.trim().isEmpty() || shipFrom.equalsIgnoreCase(emptyString)
    ) {
      throw new IllegalArgumentException(MSG_STRING_EMPTY);
    }
    this.shipFrom = shipFrom;
  }

  public String getShipFrom() {
    return shipFrom;
  }

  public void setProductPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_DETECTED);
    }
    this.price = price;
  }

  public double getProductPrice() {
    return price;
  }
}
