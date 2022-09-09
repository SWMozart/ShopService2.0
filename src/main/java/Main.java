import model.Product;
import model.ProductRepo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Product> products = new HashMap<>();

            Product product1 = new Product(1, "Shoes");
            Product product2 = new Product(2, "Trikots");
            Product product3 = new Product(3, "Shorts");
            Product product4 = new Product(4, "Caps");
            Product product5 = new Product(5, "Balls");
            Product product6 = new Product(6, "Cards");

            products.put(product1.getId(), product1);
            products.put(product2.getId(), product2);
            products.put(product3.getId(), product3);
            products.put(product4.getId(), product4);
            products.put(product5.getId(), product5);
            products.put(product6.getId(), product6);


        ProductRepo productRepo = new ProductRepo();

        productRepo.showProduct(1);

        Scanner scan = new Scanner(System.in);
    }
}
