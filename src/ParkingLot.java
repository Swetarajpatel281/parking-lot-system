import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    int LargeSpotsize;
    int CompactSpotsize;
    int bikeSpotSize;
    List<parkingspot> largeParkingspotlist;
    List<parkingspot> compactParkingSpotlist;
    List<parkingspot> bikeParkingSpotlist;

    public ParkingLot(int LargeSpotsize,  int CompactSpotsize, int bikeSpotSize) {
        this.LargeSpotsize = LargeSpotsize;
        this.CompactSpotsize = CompactSpotsize;
        this.bikeSpotSize = bikeSpotSize;

        largeParkingspotlist = new ArrayList<>();
        compactParkingSpotlist = new ArrayList<>();
        bikeParkingSpotlist = new ArrayList<>();
    }

    public void ParkTheVehicle( vehicle vehicle) {
        System.out.println("we are parking the vehilce:" + vehicle.getvehicleType());
        if ( vehicleType.TRUCK.equals(vehicle.getvehicleType())) {
            if (LargeSpotsize >0) {
                parkLargevehicle ( vehicle);
            } else {
                System.out.println("Large parking spot are full.");
            }

        } else if ( vehicleType.CAR.equals(vehicle.getvehicleType())) {
            if (CompactSpotsize >0) {
                parkCompactvehicle ( vehicle);
            } else {
                System.out.println("Car parking spot are full.");
            }

        } else if ( vehicleType.BIKE.equals(vehicle.getvehicleType())) {
            if (bikeSpotSize >0) {
                parkBikevehicle ( vehicle);
            } else {
                System.out.println("Bike parking spot are full.");
            }

        }
    }

    private void parkLargevehicle (vehicle vehicle) {
        parkingspot LargeparkingSpot = new parkingspot(parkingSpotType.LARGE);
        LargeparkingSpot.setIsFree(false);
        LargeparkingSpot.setvehicle(vehicle);
        vehicle.setParkingspot(LargeparkingSpot);

        largeParkingspotlist.add(LargeparkingSpot);
        LargeSpotsize--;
        System.out.println("Vehicle Truck park Successfully.");
    }

    private void parkCompactvehicle (vehicle vehicle) {
        parkingspot CompactparkingSpot = new parkingspot(parkingSpotType.COMPACT);
        CompactparkingSpot.setIsFree(false);
        CompactparkingSpot.setvehicle(vehicle);
        vehicle.setParkingspot(CompactparkingSpot);
        
        compactParkingSpotlist.add(CompactparkingSpot);
        CompactSpotsize--;
        System.out.println("Vehicle Car parked Successfully.");
    }

    private void parkBikevehicle (vehicle vehicle) {
        parkingspot BikeparkingSpot = new parkingspot(parkingSpotType.BIKE);
        BikeparkingSpot.setIsFree(false);
        BikeparkingSpot.setvehicle(vehicle);
        vehicle.setParkingspot(BikeparkingSpot);
      
        bikeParkingSpotlist.add(BikeparkingSpot);
        bikeSpotSize--;
        System.out.println("Vehicle Bike parked Successfully.");
    }

    public void UnparkTheVehicle (vehicle vehicle) {
        System.out.println("we are unparking the vehicle" + vehicle.getvehicleType());

        parkingspot parkingspot = vehicle.getParkingspot();
        parkingspot.setIsFree(true);

        if (vehicleType.BIKE.equals(vehicle.getvehicleType())) {
            bikeSpotSize++;
        } else if (vehicleType.TRUCK.equals(vehicle.getvehicleType())) {
            LargeSpotsize++;
        } else {
            CompactSpotsize ++;
        }

        System.out.println("Unparking the vehicle Succesfully.");
    }

}
