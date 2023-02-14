import java.util.ArrayList;
import java.util.List;


public class Inventory {

  private static final String ERROR_PROD_NOT_FOUND = " Product not FOUND ";
  private static final String ERROR_ORDER_NOT_FOUND = " Order not FOUND ";

  public Inventory() {}

  private List<Product> myProd = new ArrayList<>();
  private List<Order> myOrder = new ArrayList<>();

  public void addProduct(Product prod) {
    if (prod == null) {
        throw new IllegalArgumentException(ERROR_PROD_NOT_FOUND);
    }
    myProd.add(prod);
  }

  public void addOrder(Order ord){
    if (ord == null) {
        throw new IllegalArgumentException(ERROR_ORDER_NOT_FOUND);
    }
    myOrder.add(ord);
  }
}
