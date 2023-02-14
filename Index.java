public class Index {
    public static void main(String[] args) {
        Product myProduct = new Product(1, "Keyboard", "Canada", 500);
        Product myProduct2 = new Product(2, "Mouse", "Mexico", 700);
        
        System.out.println(myProduct.isSameProduct(myProduct2));
    }
}
