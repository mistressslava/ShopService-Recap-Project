import java.util.List;

public interface OrderRepo {
    public void add(Order order);
    public void remove(Order order);
    public Order getSingle(int id);
    public List<Order> getAll();
}
