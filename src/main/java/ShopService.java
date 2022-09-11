import model.Product;
import model.ProductRepo;
import service.Order;
import service.OrderRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }



    public Order orderProducts(List<String> productIds){
        List<Product> productsToOrder = new ArrayList<>();
        for (String productId : productIds){
            Product productToAdd = getProduct(productId);
            productsToOrder.add(productToAdd);
        }
        String id = UUID.randomUUID().toString();
        return orderRepo.addOrder(new Order(id, productsToOrder));
    }

    public Product getProduct(Integer productId){
        return productRepo.showProduct(productId);
    }

    public List<Order> listOrders(){
        return orderRepo.showAllOrders();
    }

}
