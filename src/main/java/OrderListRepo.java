import java.util.List;

public record OrderListRepo() implements OrderRepo {
    private static List<Order> orders;

    //add check
    @Override
    public void add(Order order) {
        orders.add(order);
    }

    @Override
    public void remove(Order order) {
        orders.remove(order);
    }

    @Override
    public Order getSingle(int id) {
        return orders.get(id);
    }

    @Override
    public List<Order> getAll() {
        return orders.stream().toList();
    }
}
