package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductRepo {


    private Map<Integer, Product> products = new HashMap<>();

    public Product showProduct (Integer number) {
        Product foundProducts = products.get(number);
        System.out.println(foundProducts);

        return foundProducts;
    }

    public Collection<Product> showAllProducts () {
        Collection<Product> foundAllProducts = products.values();

        return foundAllProducts;
    }
}