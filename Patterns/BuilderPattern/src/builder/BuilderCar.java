package builder;

import entities.Car;

public abstract class BuilderCar {

	
	protected Car car;
    // ------------------------------
    public Car getCar() {
        return this.car;
    }
    // ------------------------------
     public void createNewCar() {
        this.car = new Car();
    }
    // ------------------------------------
    // Métodos que deberán ser construídos por las clases que hereden de ésta
     public abstract void buildMotor();
     public abstract void buildBodywork();
     public abstract void buildAirConditioner();
     public abstract void buildPowerWindows();
	
}
