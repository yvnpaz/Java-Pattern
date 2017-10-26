package builder;

public class BuildTotalCar extends BuilderCar {
 
	public BuildTotalCar() {}

	@Override
	public void buildMotor() {
		// TODO Auto-generated method stub
		this.car.setEngine("Motor de potencia máxima");
	}

	@Override
	public void buildBodywork() {
		this.car.setBodywork("Carrocería con protección total");
	}

	@Override
	public void buildAirConditioner() {
		this.car.setAirConditioner(true);
	}

	@Override
	public void buildPowerWindows() {
		this.car.setPowerWindows(true);
	}
}
