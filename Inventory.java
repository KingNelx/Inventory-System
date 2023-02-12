import java.util.ArrayList;
import java.util.List;

public class Inventory {

  private List<Product> product = new ArrayList<>();
  private List<Order> order = new ArrayList<>();

  private static final String MSG_PRODUCT_EMPTY = " Product List is Empty ";
  private static final String MSG_ORDER_EMPTY = " Order List is Empty ";

  public void addProduct(Product prod) {
    if (product.isEmpty()) {
      throw new IllegalArgumentException(MSG_PRODUCT_EMPTY);
    } else {
      product.add(prod);
    }
  }

  public void addOrder(Order ord) {
    if (order.isEmpty()) {
      throw new IllegalArgumentException(MSG_ORDER_EMPTY);
    } else {
      order.add(ord);
    }
  }
}
/*
 Create an Inventory class: This class will hold the
  list of products and orders and should have methods to add products and orders,
   as well as retrieve specific products and orders based on their id.
 */
