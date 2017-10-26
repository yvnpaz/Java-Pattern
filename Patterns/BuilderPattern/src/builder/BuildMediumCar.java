package builder;

public class BuildMediumCar extends BuilderCar {

	public BuildMediumCar() {}
	
	@Override
	public void buildMotor() {
		this.car.setEngine("Motor de potencia media");		
	}

	@Override
	public void buildBodywork() {
		this.car.setEngine("Carrocería con protección media");
	}

	@Override
	public void buildAirConditioner() {
		this.car.setAirConditioner(false);
	}

	@Override
	public void buildPowerWindows() {
		this.car.setPowerWindows(true);
	}

}
