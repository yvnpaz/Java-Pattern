package caldoMasEnvasado;

public class PreparedSpinach extends CookFood {

	public PreparedSpinach(IProcess iProcess) {
		this.setIProcess(iProcess);
	}
	
	@Override
	public void obtain() {
		System.out.println("Preparando espinacas...");
		this.getIProcess().process();
	}

}
