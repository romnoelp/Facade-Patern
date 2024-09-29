public class Cart implements HotelService {
    private final int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void service() {
        requestCart();
    }

    public void requestCart() {
        System.out.println("Requesting " + numberOfCarts + " carts.");
    }
}
