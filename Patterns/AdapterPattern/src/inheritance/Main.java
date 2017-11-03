package inheritance;

import composicion.Adapter;

public class Main {

	public static void main(String[] args) {
		Adapter converse = new Adapter();
		converse.ingresarPesetas(2000);
		converse.ingresarPesetas(5000);
		converse.ingresarPesetas(1000);
		System.out.println("Total euros: " + converse.getSaldo());
	}
}
