import java.util.List;
import java.util.ArrayList;


public class Inventory {

    Errors error = new Errors();

    private List <Product> productList = new ArrayList<>();

    public Inventory(){

    }

    public void addProduct(Product thisProduct){
        if(thisProduct instanceof Product){
            productList.add(thisProduct);
        }else if(thisProduct == null){
            throw new IllegalArgumentException(error.ERROR_MSG_NULL());
        }else{
            throw new IllegalArgumentException(error.ERROR_MSG_FAILED_TO_ADD());
        }
    }

    public void removeProduct(Product thisProduct){
        if(thisProduct instanceof Product){
            productList.remove(thisProduct);
        }else if(thisProduct == null){
            throw new IllegalArgumentException(error.ERROR_MSG_NULL());
        }else{
            throw new IllegalArgumentException(error.ERROR_MSG_FAILED_TO_REMOVE());
        }
    }

}
/*
 Create an Inventory class: This class will manage the list of products.
  It should have an ArrayList to hold the products, and methods to add, remove, \
  and update products in the list. You can also include methods to search for products 
  and display the entire inventory.
 */
