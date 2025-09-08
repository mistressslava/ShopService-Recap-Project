import java.util.List;
import java.util.Optional;

public class ProductRepo {
    private static List<Product> productList;

    public void addProduct(Product product) {
        if (product != null) {
            productList.add(product);
        }
    }

    public void deleteProductById(int id) {
        productList.removeIf(p -> p.id() == id);
    }

    public Product getProduct(int id) {
        for (Product product : productList) {
            if (product.id() != id) {
                return null;
            }
        }
        return productList.get(id);
    }

    public static List<Product> getProductList() {
        return productList.stream().toList();
    }

    public Optional<Product> getOptionalProduct(int id) {
        return productList.stream()
                .filter(p -> p.id() == id)
                .findFirst();
    }
}
