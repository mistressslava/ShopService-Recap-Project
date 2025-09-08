public record Order(int id, String name, Product product, double totalPrice) {
    private static int counter = 0;

    public Order(String name, Product product, double totalPrice) {
        this(++counter, name, product, totalPrice);
    }
}
