package builder;

public class BuildBaseCar extends BuilderCar {

	public BuildBaseCar() {}
	
	@Override
	public void buildMotor() {
		this.car.setEngine("Motor de potencia mínima");
	}

	@Override
	public void buildBodywork() {
		this.car.setBodywork("Carrocería con protección base");
	}

	@Override
	public void buildAirConditioner() {
		this.car.setAirConditioner(false);
	}

	@Override
	public void buildPowerWindows() {
		this.car.setPowerWindows(false);
	}

}
