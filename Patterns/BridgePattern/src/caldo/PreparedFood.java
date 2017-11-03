package caldo;

public class PreparedFood extends CookFood {

	public PreparedFood(IProcess iprocess) {
		this.setIProcess(iprocess);
	}

	@Override
	public void obtain() {
		System.out.println("Preparando caldo...");
		this.getIProcess().process();
	}

}
