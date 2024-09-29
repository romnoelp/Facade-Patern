public class Valet implements HotelService{
    private final String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void service() {
        pickUpVehicle();
    }

    public void pickUpVehicle() {
        System.out.println("Picking up vehicle with plate number " + plateNumber);
    }
}
