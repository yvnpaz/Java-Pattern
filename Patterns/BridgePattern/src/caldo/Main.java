package caldo;

public class Main {

	public static void main(String[] args) {
		// Crear un objeto de tipo 'AbstraccionRefinada' indic�ndole un
		// 'ImplementadorConcreto'
		CookFood caldoOurense = new PreparedFood(new Verzas());
		caldoOurense.obtain();
		
		// Ahora le indicamos que use otra implementaci�n para obtener la de
		// verduras
		caldoOurense.setIProcess(new Spinach());
		caldoOurense.obtain();
	}

}
