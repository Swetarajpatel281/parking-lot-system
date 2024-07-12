public class vehicle {
  int vehicle_no;
  private vehicleType vehicleType ;
  private  parkingspot parkingspot;

  public vehicle(vehicleType truck) {
  
  }
  public int getvehicleno (){
    return this.vehicle_no;
  }
   public void setvehicleno (int vehicle_no) {
    this.vehicle_no = vehicle_no;
   }
   public vehicleType getvehicleType ()  {
     return this.vehicleType;
   }
   public void setvehicleType (vehicleType vehicleType){
    this.vehicleType = vehicleType;
   }
   public parkingspot getParkingspot ()  {
    return this.parkingspot;
  }
   public void  setParkingspot (parkingspot parkingspot) {
    this.parkingspot = parkingspot;
   }

}
