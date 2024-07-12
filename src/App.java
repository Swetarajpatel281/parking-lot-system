public class App {
    public static void main(String[] args) throws Exception {
        ParkingLot ParkingLot = new ParkingLot(1,2 , 3);
        vehicle vehicle1 = new vehicle(vehicleType.TRUCK);
        ParkingLot.ParkTheVehicle(vehicle1);
        vehicle vehicle2 = new vehicle(vehicleType.TRUCK);
        ParkingLot.ParkTheVehicle(vehicle2);



        //do payment method -> on hours basis -> cash/ card / upi.
        // do multifloor parking system.
        // Entry and exit -> ticket

    
    }
}
