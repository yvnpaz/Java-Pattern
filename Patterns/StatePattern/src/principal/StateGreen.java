package principal;

import principal.state.StateSemaforo;

public class StateGreen extends StateSemaforo {

	public StateGreen() { }

	@Override
	public void mostrar() {
		System.out.println("Luz verde");
	}

}
