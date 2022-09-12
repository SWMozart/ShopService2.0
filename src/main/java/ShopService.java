import model.Product;
import model.ProductRepo;
import service.Order;
import service.OrderRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }



    public Order orderProducts(List<Integer> productIds){
        List<Product> productsToOrder = new ArrayList<>();
        for (Integer productId : productIds){
            Product productToAdd = getProduct(productId);
            productsToOrder.add(productToAdd);
        }
        int id = productsToOrder.size()+1;
        return orderRepo.addOrder(new Order(id, productsToOrder));
    }

    public Product getProduct(Integer productId){
        return productRepo.showProduct(productId);
    }

    public Map<Integer, Order> Orders() {
        return orderRepo.showAllOrders();
    }

}
