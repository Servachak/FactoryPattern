public class TrainFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return  new Train();
    }
}
