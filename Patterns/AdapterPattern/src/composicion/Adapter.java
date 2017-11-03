package composicion;

public class Adapter implements IAdapter {

	BoxEuro boxEuro = new BoxEuro();

	public Adapter() {
	}

	public double getSaldo() {
		return this.boxEuro.getTotalEuros();
	}

	@Override
	public void sacarPesetas(double pesetas) {
		 double euros = pesetas / 166.386;
         boxEuro.sacarEuros( euros );
	}

	@Override
	public void ingresarPesetas(double pesetas) {
		double euros = pesetas / 166.386;
        boxEuro.ingresarEuros( euros );
	}

}
