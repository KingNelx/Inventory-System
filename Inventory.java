import java.util.ArrayList;

public class Inventory {

  ArrayList<Product> prodList = new ArrayList<>();
  ArrayList<Order> ordList = new ArrayList<>();

  public void addProducts(Product prod) {
    prodList.add(prod);
  }

  public void removeProducts(Product prod) {
    prodList.remove(prod);
  }

  public void addOrders(Order ord) {
    ordList.add(ord);
  }

  public void removeOrders(Order ord) {
    ordList.remove(ord);
  }
}
