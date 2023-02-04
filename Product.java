public class Product {

  private int productID;
  private String productName;
  private double productPrice;
  private String productBrand;
  private String productCategory;
  private static final String emptySpace = " ";

  private static final String MSG_STRING_EMPTY = " Empty Text Detected ";
  private static final String MSG_CONTAIN_NULL = " Null Text Detected ";
  private static final String MSG_INT_NEGATIVE = " Negative Number Detected ";

  public void setProductID(int productID) {
    if (productID < 0) {
      throw new IllegalArgumentException(MSG_INT_NEGATIVE);
    } else {
      this.productID = productID;
    }
  }

  public void setProductName(String productName) {
    if (productName == null || productName.trim().isEmpty()) {
      throw new IllegalArgumentException(MSG_CONTAIN_NULL);
    }
    if (productName.equals(emptySpace)) {
      throw new IllegalArgumentException(MSG_STRING_EMPTY);
    } else {
      this.productName = productName;
    }
  }

  public void setProductPrice(double productPrice) {
    if (productPrice < 0) {
      throw new IllegalArgumentException(MSG_INT_NEGATIVE);
    } else {
      this.productPrice = productPrice;
    }
  }

  public void setProductBrand(String productBrand) {
    if (productBrand == null || productBrand.trim().isEmpty()) {
      throw new IllegalArgumentException(MSG_CONTAIN_NULL);
    }
    if (productBrand.equals(emptySpace)) {
      throw new IllegalArgumentException(MSG_STRING_EMPTY);
    } else {
      this.productBrand = productBrand;
    }
  }

  public void setProductCategory(String productCategory) {
    if (productCategory == null || productCategory.trim().isEmpty()) {
        throw new IllegalArgumentException(MSG_CONTAIN_NULL);
    }
    if (productCategory.equals(emptySpace)) {
        throw new IllegalArgumentException(MSG_STRING_EMPTY);
    }
  }

  public int getProductID() {
    return productID;
  }

  public String getProductName() {
    return productName;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public String getProductBrand() {
    return productBrand;
  }

  public String getProductCategory() {
    return productCategory;
  }
}
