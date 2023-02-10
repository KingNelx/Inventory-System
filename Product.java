public class Product {

  private int productID;
  private String productName;
  private double productPrice;
  private String manufacturerName;
  private String emptySpace = " ";

  private static final String MSG_NUMBER_NEGATIVE =
    " Negative Number Detected ";
  private static final String MSG_STRING_NULL = " NULL is Detected ";
  private static final String MSG_STRING_EMPTY = " Empty String Detected";
    
  public Product(
    int productID,
    String productName,
    double productPrice,
    String manufacturerName
  ) {
    setProductID(productID);
    setProductName(productName);
  }

  public void setProductID(int productID) {
    if (productID < 0) {
      throw new IllegalArgumentException(MSG_NUMBER_NEGATIVE);
    } else {
      this.productID = productID;
    }
  }

  public int getProductID() {
    return productID;
  }

  public void setProductName(String productName) {
    if (productName == null) {
      throw new IllegalArgumentException(MSG_STRING_NULL);
    }
    if (productName.trim().equalsIgnoreCase(emptySpace) || productName.isEmpty()) {
      throw new IllegalArgumentException(MSG_STRING_EMPTY);
    } else {
      this.productName = productName;
    }
  }

  public String getProductName() {
    return productName;
  }

  public void setProductPrice (double productPrice) {
    if (productPrice < 0){
        throw new IllegalArgumentException(MSG_NUMBER_NEGATIVE);
    }else {
        this.productPrice = productPrice;
    }
  }

  public double getProductPrice () {
    return productPrice;
  }


  public void setManufacturer (String manufacturerName) {
    if (manufacturerName == null) {
        throw new IllegalArgumentException(MSG_STRING_NULL);
    }if (manufacturerName.trim().equalsIgnoreCase(emptySpace) || manufacturerName.isEmpty()) {
        throw new IllegalArgumentException(MSG_STRING_EMPTY);
    }else {
        this.manufacturerName =  manufacturerName;
    }
  }

  public String getManufacturerName() {
    return manufacturerName;
  }
}
