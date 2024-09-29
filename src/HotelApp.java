public class HotelApp {
    public static void main(String[] args) throws Exception {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValet("PHG 970");
        frontDesk.requestHouseKeeping(12);
        frontDesk.requestCart(3);
    }
}
