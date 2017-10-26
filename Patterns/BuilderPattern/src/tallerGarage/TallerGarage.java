package tallerGarage;

import builder.BuilderCar;

public class TallerGarage {

	public TallerGarage() {}
	// --------------------------

    public void build( BuilderCar builder )
    {
        builder.createNewCar();

        builder.buildMotor();
        builder.buildBodywork();
        builder.buildPowerWindows();
        builder.buildAirConditioner();
    }
}
