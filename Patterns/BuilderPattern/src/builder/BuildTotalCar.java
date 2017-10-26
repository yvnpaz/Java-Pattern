package builder;

public class BuildTotalCar extends BuilderCar {
 
	public BuildTotalCar() {}

	@Override
	public void buildMotor() {
		// TODO Auto-generated method stub
		this.car.setEngine("Motor de potencia m�xima");
	}

	@Override
	public void buildBodywork() {
		this.car.setBodywork("Carrocer�a con protecci�n total");
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
