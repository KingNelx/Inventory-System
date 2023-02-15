interface ProductCost {
  double totalCost(int quantity);
  boolean areProductsEqual(Product otherProduct);
}

public class Product implements ProductCost {

  private int productID;
  private String productName;
  private int quantity;
  private double price;
  private String productDescription;
  private String productSupplier;
  private static final String emptyString = " ";

  Errors error = new Errors();

  public Product(
    int productID,
    String productName,
    int quantity,
    double price,
    String description,
    String supplier
  ) {
    setProductID(productID);
    setProductName(productName);
    setQuantity(quantity);
    setPrice(price);
    setDescription(description);
    setSupplier(supplier);
  }

  @Override
  public double totalCost(int quantity) {
    return quantity * getPrice();
  }

  @Override
  public boolean areProductsEqual(Product otherProduct) {
    return getProductID() == otherProduct.getProductID();
  }

  

  public void setProductID(int productID) {
    if (productID < 0) {
      throw new IllegalArgumentException(error.ERROR_MSG_NEGATIVE_NUMBER());
    }
    this.productID = productID;
  }

  public int getProductID() {
    return productID;
  }

  public void setProductName(String productName) {
    if (productName == null) {
      throw new IllegalArgumentException(error.ERROR_MSG_NULL());
    } else if (
      productName.trim().equalsIgnoreCase(emptyString) || productName.isEmpty()
    ) {
      throw new IllegalArgumentException(error.ERROR_MSG_EMPTY_STRING());
    }
    this.productName = productName;
  }

  public String getProductName() {
    return productName;
  }

  public void setQuantity(int quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException(error.ERROR_MSG_NEGATIVE_NUMBER());
    }
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException(error.ERROR_MSG_NEGATIVE_NUMBER());
    }
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setDescription(String description) {
    if (description == null) {
      throw new IllegalArgumentException(error.ERROR_MSG_NULL());
    } else if (
      description.trim().equalsIgnoreCase(emptyString) || description.isEmpty()
    ) {
      throw new IllegalArgumentException(error.ERROR_MSG_EMPTY_STRING());
    }
    this.productDescription = description;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setSupplier(String supplier) {
    if (supplier == null) {
      throw new IllegalArgumentException(error.ERROR_MSG_NULL());
    } else if (
      supplier.trim().equalsIgnoreCase(emptyString) || supplier.isEmpty()
    ) {
      throw new IllegalArgumentException(error.ERROR_MSG_EMPTY_STRING());
    }
    this.productSupplier = supplier;
  }

  public String getSupplier() {
    return productSupplier;
  }
}
