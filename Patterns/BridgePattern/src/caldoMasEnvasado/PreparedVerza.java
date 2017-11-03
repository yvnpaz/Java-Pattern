package caldoMasEnvasado;

public class PreparedVerza extends CookFood {

	public PreparedVerza(IProcess iprocess) {
		this.setIProcess(iprocess);
	}

	@Override
	public void obtain() {
		System.out.println("Preparando verzas...");
		this.getIProcess().process();
	}
	
}
