package principal;

import principal.state.StateSemaforo;

public class StateOrange extends StateSemaforo {

	public StateOrange() {}

	@Override
	public void mostrar() {
		System.out.println("Luz naranja");
	}
}
