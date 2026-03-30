import java.util.*;

public class Auction {
    private List<Product> products;

    public Auction() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {
        for (Product p : products) {
            p.display();
        }
    }

    public void placeBid(String userName, String productName, double amount) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                p.placeBid(userName, amount);
                return;
            }
        }
        System.out.println("Product not found!");
    }
}
