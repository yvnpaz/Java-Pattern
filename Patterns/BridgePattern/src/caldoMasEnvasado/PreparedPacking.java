package caldoMasEnvasado;

public class PreparedPacking implements IProcess {

	public PreparedPacking() {}
	
	@Override
	public void process() {
		System.out.println("\tAlimento envasado.");
	}

}
