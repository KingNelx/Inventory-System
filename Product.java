public class Product {

  private int productID;
  private String productName;
  private double productPrice;
  private String productBrand;
  private String productCategory;
  private String emptySpace = " ";

  private static final String MSG_STRING_EMPTY = " Empty Text Detected ";
  private static final String MSG_CONTAIN_NULL = " Null Text Detected ";

  public void setProductID() {}

  public void setProductName() {}

  public void setProductPrice() {}

  public void setProductBrand() {}

  public void setProductCategory() {}

  public int getProductID () {
    return productID;
  }

  public String getProductName () {
    return productName;
  }

  public double getproductPrice () {
    return productPrice;
  }

  public String getProductBrand () {
    return productBrand;
  }

  public String getProductCategory () {
    return productCategory;
  }
}
