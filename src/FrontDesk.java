public class FrontDesk {
    public void requestValet(String plateNumber) {
        HotelService valet = new Valet(plateNumber);
        valet.service();
    }

    public void requestHouseKeeping(int roomNumber) {
        HotelService houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.service();
    }

    public void requestCart(int numberOfCarts) {
        HotelService cart = new Cart(numberOfCarts);
        cart.service();
    }
}