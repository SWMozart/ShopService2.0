package service;

import model.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    private Map<Integer, Order> orders = new HashMap<>();


    public Order showOrder(Integer number) {
        Order foundOrders = orders.get(number);
        System.out.println(foundOrders);

        return foundOrders;
    }

    //public Collection<Order> showAllOrders() {
      //  return orders.values();

  //  }

    public Order addOrder(Order newOrder) {
       return orders.put(newOrder.getId(), newOrder);

    }

    public Map<Integer, Order> showAllOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }
}
