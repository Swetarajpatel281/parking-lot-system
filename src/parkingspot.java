public class parkingspot {
    private parkingSpotType parkingSpotType;
    private boolean isFree;
    private vehicle vehicle;
    public parkingspot (parkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
    public parkingSpotType getParkingSpotType (){
        return this.parkingSpotType;
    }
    public void setParkingspoType (parkingSpotType parkingSpotType){
        this.parkingSpotType= parkingSpotType;
    }
    public boolean getIsFree (){
        return this.isFree;
    }
    public void setIsFree (boolean isFree){
        this.isFree = isFree;
    }
    public vehicle getvehicle (){
        return this.vehicle;
    }
    public void setvehicle (vehicle vehicle){
        this.vehicle = vehicle;
    } 

}
