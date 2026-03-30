public class Product {
    private String name;
    private double basePrice;
    private double highestBid;
    private String highestBidder;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.highestBid = basePrice;
        this.highestBidder = "None";
    }

    public String getName() {
        return name;
    }

    public double getHighestBid() {
        return highestBid;
    }

    public void placeBid(String bidder, double amount) {
        if (amount > highestBid) {
            highestBid = amount;
            highestBidder = bidder;
            System.out.println("Bid successful!");
        } else {
            System.out.println("Bid too low!");
        }
    }

    public void display() {
        System.out.println("Product: " + name +
                " | Highest Bid: " + highestBid +
                " | Bidder: " + highestBidder);
    }
}
