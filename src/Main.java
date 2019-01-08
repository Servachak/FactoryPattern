public class Main {
    public static void main(String[] args) {

    VehicleFactory vehicleFactory = createFactory("train");
    Vehicle vehicle = vehicleFactory.createVehicle();

    vehicle.move();
    }

    static  VehicleFactory createFactory(String s){
        if(s.equalsIgnoreCase("car")){
            return  new CarFactory();
        }else if (
                s.equalsIgnoreCase("train")){
            return  new TrainFactory();
        }else {
            throw new RuntimeException("vehicle unknown");
        }
    }
}
