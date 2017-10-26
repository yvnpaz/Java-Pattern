package entities;

public class Car {

	private String engine = "";
    private String bodywork = "";
    private Boolean powerWindows = false;
    private Boolean airConditioner = false;
    
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getBodywork() {
		return bodywork;
	}
	public void setBodywork(String bodywork) {
		this.bodywork = bodywork;
	}
	public Boolean getPowerWindows() {
		return powerWindows;
	}
	public void setPowerWindows(Boolean powerWindows) {
		this.powerWindows = powerWindows;
	}
	public Boolean getAirConditioner() {
		return airConditioner;
	}
	public void setAirConditioner(Boolean airConditioner) {
		this.airConditioner = airConditioner;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airConditioner == null) ? 0 : airConditioner.hashCode());
		result = prime * result + ((bodywork == null) ? 0 : bodywork.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((powerWindows == null) ? 0 : powerWindows.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (airConditioner == null) {
			if (other.airConditioner != null)
				return false;
		} else if (!airConditioner.equals(other.airConditioner))
			return false;
		if (bodywork == null) {
			if (other.bodywork != null)
				return false;
		} else if (!bodywork.equals(other.bodywork))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (powerWindows == null) {
			if (other.powerWindows != null)
				return false;
		} else if (!powerWindows.equals(other.powerWindows))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", bodywork=" + bodywork + ", powerWindows=" + powerWindows
				+ ", airConditioner=" + airConditioner + "]";
	}    
}
