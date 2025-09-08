import java.security.SecureRandom;
import java.util.List;

public class ShopService {

    public void addNewOrder(Order order) {
        if (ProductRepo.getProductList().contains(order.product())) {
            new OrderListRepo().add(order);
            new OrderMapRepo().add(order);
        } else {
            System.out.println("Sorry, such product does not exist");
        }

    }
}
