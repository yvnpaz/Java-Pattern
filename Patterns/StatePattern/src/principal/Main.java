package principal;

public class Main {

	public static void main(String[] args) {
		Semaforo objSemaforo = new Semaforo();

		// Muestra el aviso por defecto (verde, no hay alerta)
		objSemaforo.mostrar();
		objSemaforo.setEstado(new StateOrange());
		objSemaforo.mostrar();
		objSemaforo.setEstado(new StateRed());
		objSemaforo.mostrar();
	}

}
