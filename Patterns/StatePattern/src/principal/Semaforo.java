package principal;

import principal.state.StateSemaforo;

public class Semaforo {

	private StateSemaforo objStateSemaforo;

	// -------------------------------------------
	public Semaforo() {
		this.objStateSemaforo = new StateGreen();
	}

	// -------------------------------------------
	public void setEstado(StateSemaforo objStateSemaforo) {
		this.objStateSemaforo = objStateSemaforo;
	}

	// -------------------------------------------
	
	public void mostrar() {
		this.objStateSemaforo.mostrar();
	}
	
}
