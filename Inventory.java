import java.util.ArrayList;
import java.util.List;

public class Inventory {

  private List<Product> product = new ArrayList<>();
  private List<Order> order = new ArrayList<>();


  public Inventory(Product prod, Order ord) {
    addProduct(prod);
    addOrder(ord);
  }

  private static final String MSG_PRODUCT_EMPTY = " Product List is Empty ";
  private static final String MSG_ORDER_EMPTY = " Order List is Empty ";
  private static final String MSG_NEGATIVE_NUM = " Negative number detected ";
  private static final String MSG_PRODUCT_NOT_FOUND =
    " Product not found exception ";
  private static final String MSG_ORDER_NOT_FOUND =
    " Order not found exception ";

  public void addProduct(Product prod) {
    if (prod == null || !(prod instanceof Product)) {
      throw new IllegalArgumentException(MSG_PRODUCT_EMPTY);
    } else {
      product.add(prod);
    }
  }

  public void addOrder(Order ord) {
    if (ord == null || !(ord instanceof Order)) {
      throw new IllegalArgumentException(MSG_ORDER_EMPTY);
    } else {
      order.add(ord);
    }
  }

  public Product getProductByID(int prodID) {
    if (prodID < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_NUM);
    }
    for (Product prod : product) {
      if (prod.getProductID() == prodID) {
        return prod;
      }
    }
    throw new IllegalArgumentException(MSG_PRODUCT_NOT_FOUND);
  }

  public Order getOrderByID(int orderID) {
    if (orderID < 0) {
      throw new IllegalArgumentException(MSG_NEGATIVE_NUM);
    }

    for (Order ord : order) {
      if (ord.getOrderID() == orderID) {
        return ord;
      }
    }
    throw new IllegalArgumentException(MSG_ORDER_NOT_FOUND);
  }

  public String printOrders(Product prod) {
    return (
      " Product ID: " +
      prod.getProductID() +
      "\n Product Name: " +
      prod.getProductName() +
      "\n Product Price: " +
      prod.getProductPrice() +
      "\n Manufacturer: " +
      prod.getManufacturerName()
    );
  }
}
/*
 Create an Inventory class: This class will hold the
  list of products and orders and should have methods to add products and orders,
   as well as retrieve specific products and orders based on their id.
 */
