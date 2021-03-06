import java.util.Observable;
import java.util.Observer;

public class MyPatternObserver {

	public static class ClaseObservador extends Observable {

		int colorSeleccionado;
		String color;

		public ClaseObservador() {}

		public int getColorSeleccionado() {
			return colorSeleccionado;
		}

		/**
		 * !!indica a mi clase observadora que ha cambiado
		 * @param colorSeleccionado
		 */
		public void setColorSeleccionado(int colorSeleccionado) {
			this.colorSeleccionado = colorSeleccionado;
			setChanged();
			notifyObservers();
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

	}

	public static class VentanaColor implements Observer {

		ClaseObservador miObservador;
		int colorSeleccionado;

		public VentanaColor(ClaseObservador observer) {
			this.miObservador = observer;
		}

		public int getColor() {
			return colorSeleccionado;
		}

		public void setColor(int color) {
			this.colorSeleccionado = color;
		}

		/**
		 * Importante: Metodo de actualizar, comun para todos los metodos que
		 * implementen observer
		 */
		public void update(Observable arg0, Object arg1) {
			// TASK
			colorSeleccionado = miObservador.getColorSeleccionado();

			switch (colorSeleccionado) {
			case 1:
				System.out.println("Seleccionado ROJO.");
				break;
			case 2:
				System.out.println("Seleccionado AZUL.");
				break;
			case 3:
				System.out.println("Seleccionado VERDE.");
				break;
			default:
				System.out.println("Sin color.");
			}
		}

	}

	public static void main(String[] args) {

		ClaseObservador observador = new ClaseObservador();
		VentanaColor miVentanaColor = new VentanaColor(observador);

		/** Aqui se Agregan los observadores */
		observador.addObserver(miVentanaColor);

		observador.setColorSeleccionado(2);
		observador.setColorSeleccionado(3);
		miVentanaColor.update(observador, miVentanaColor);
	}
}
