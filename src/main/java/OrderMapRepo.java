import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{

    private static Map<Integer, Order> placedOrders;

    @Override
    public void add(Order order) {
        if (ProductRepo.getProductList().contains(order.product())) {
            placedOrders.put(order.id(), order);
        }
        System.out.println("Such order does not exist");
    }

    @Override
    public void remove(Order order) {
        if (ProductRepo.getProductList().contains(order.product())) {
            placedOrders.remove(order.id());
        }
    }

    @Override
    public Order getSingle(int id) {
        return placedOrders.remove(id);
    }

    @Override
    public List<Order> getAll() {
        return List.of();
    }

//    @Override
//    public Map<Integer, Order> getAll() {
//        return placedOrders
//    }
}
