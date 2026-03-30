import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Auction auction = new Auction();

        auction.addProduct(new Product("Laptop", 50000));
        auction.addProduct(new Product("Mobile", 20000));

        while (true) {
            System.out.println("\n1. View Products");
            System.out.println("2. Place Bid");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    auction.showProducts();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter product name: ");
                    String productName = sc.nextLine();

                    System.out.print("Enter bid amount: ");
                    double bid = sc.nextDouble();

                    auction.placeBid(name, productName, bid);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
