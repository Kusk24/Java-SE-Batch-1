package Service;

import Model.Car;
import Model.Vehicle;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService{
    private int doors;


    @Override
    public void getRegisterInfo() throws IOException {
        System.out.print("Enter numbers of car doors : ");
        doors = Integer.parseInt(br.readLine());
        VehicleRegisterService.getVehicleList()[Vehicle.getVehicleCount() - 1] = new Car(this.getVehicle(), this.doors);
    }
}
