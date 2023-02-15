import java.util.ArrayList;
import java.util.List;

interface findDuality {
  public void findyProductByID(Product otherProductID);
}

public class Inventory implements findDuality {

  Errors error = new Errors();

  private List<Product> productList = new ArrayList<>();

  public Inventory() {}

  @Override
  public void findyProductByID(Product otherProductID) {
    if (otherProductID instanceof Product) {
      throw new IllegalArgumentException(error.ERROR_OBJECT_NOT_FOUND());
    }
    for (Product prod : productList) {
      if(prod.getProductID() == otherProductID.getProductID()) {
        System.out.println(prod);
      }
    }
  }

  public void addProduct(Product thisProduct) {
    if (thisProduct instanceof Product) {
      productList.add(thisProduct);
    } else if (thisProduct == null) {
      throw new IllegalArgumentException(error.ERROR_MSG_NULL());
    } else {
      throw new IllegalArgumentException(error.ERROR_MSG_FAILED_TO_ADD());
    }
  }

  public void removeProduct(Product thisProduct) {
    if (thisProduct instanceof Product) {
      productList.remove(thisProduct);
    } else if (thisProduct == null) {
      throw new IllegalArgumentException(error.ERROR_MSG_NULL());
    } else {
      throw new IllegalArgumentException(error.ERROR_MSG_FAILED_TO_REMOVE());
    }
  }

  public void updateProductByID(
    Product product,
    int productID,
    String productName,
    double price,
    String description,
    String supplier
  ) {
    product.setProductID(productID);
    product.setProductName(productName);
    product.setPrice(price);
    product.setDescription(description);
    product.setSupplier(supplier);
  }

  public String showAllProducts() {
    StringBuilder sb = new StringBuilder();
    if (productList.isEmpty()) {
      throw new IllegalArgumentException(error.ERROR_MSG_PRODUCT_EMPTY());
    }
    for (Product product : productList) {
      sb
        .append("\nProduct ID: ")
        .append(product.getProductID())
        .append("\nProduct Name: ")
        .append(product.getProductName())
        .append("\nProduct Price: ")
        .append(product.getPrice())
        .append("\nProduct Description: ")
        .append(product.getProductDescription())
        .append("\nProduct Supplier: ")
        .append(product.getSupplier())
        .append("\n");
    }
    return sb.toString();
  }
}
/*
 Create an Inventory class: This class will manage the list of products.
  It should have an ArrayList to hold the products, and methods to add, remove, \
  and update products in the list. You can also include methods to search for products 
  and display the entire inventory.
 */
