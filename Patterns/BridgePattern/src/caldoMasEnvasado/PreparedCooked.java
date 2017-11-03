package caldoMasEnvasado;

public class PreparedCooked implements IProcess {

	public PreparedCooked() {}
	
	@Override
	public void process() {
		System.out.println("\tAlimento cocinado.");
	}

}
