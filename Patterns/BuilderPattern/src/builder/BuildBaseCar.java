package builder;

public class BuildBaseCar extends BuilderCar {

	public BuildBaseCar() {}
	
	@Override
	public void buildMotor() {
		this.car.setEngine("Motor de potencia m�nima");
	}

	@Override
	public void buildBodywork() {
		this.car.setBodywork("Carrocer�a con protecci�n base");
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
