package principal;

import principal.state.StateSemaforo;

public class StateRed extends StateSemaforo {

	public StateRed() {}

	@Override
	public void mostrar() {
		System.out.println("Luz roja");
	}
}
