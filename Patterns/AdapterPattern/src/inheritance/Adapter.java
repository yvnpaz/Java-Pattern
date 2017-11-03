package inheritance;

public class Adapter extends BoxEuro implements IAdapter {

	public Adapter() {}
	
	@Override
	public void sacarPesetas(double pesetas) {
		double euros = pesetas/166.386;
		this.sacarEuros(euros);
	
	}

	@Override
	public void ingresarPesetas(double pesetas) {
		double euros = pesetas/166.386;
		this.ingresarEuros(euros);
	}

}
