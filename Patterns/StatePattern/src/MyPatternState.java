
public class MyPatternState {

	static class Semaforo {
		private EstadoSemaforo objEstadoSemaforo;

		// -------------------------------------------
		public Semaforo() {}

		// -------------------------------------------
		public void setEstado(EstadoSemaforo objEstadoSemaforo) {
			this.objEstadoSemaforo = objEstadoSemaforo;
		}

		// -------------------------------------------
		
		
		public void mostrar() {
			this.objEstadoSemaforo.mostrar();
		}
	}
	
	class EstadoVerde extends EstadoSemaforo
	{
	    public EstadoVerde() {}
	    // -------------------------------------------
	    @Override
	     public void mostrar() {
	        System.out.println("Luz verde");
	    }
	}
	
	class EstadoNaranja extends EstadoSemaforo
	{
	    public EstadoNaranja() {
	    }
	    // -------------------------------------------
	    @Override
	     public void mostrar() {
	        System.out.println("Luz naranja");
	    }
	}
	
	class EstadoRojo extends EstadoSemaforo
	{
	    public EstadoRojo() {
	    }
	    // -------------------------------------------
	    @Override
	     public void mostrar() {
	        System.out.println("Luz roja");
	    }
	}
	
	public abstract class EstadoSemaforo
	{
	    // Método que deberán crear las clases que hereden de ésta
	    public abstract void mostrar();
	}
	
	public static void main(String[] args) {
		Semaforo objSemaforo = new Semaforo();		
		
		// Muestra el aviso por defecto (verde, no hay alerta)
		objSemaforo.mostrar();
		
//	    EstadoNaranja orange = objSemaforo.setEstado(objEstadoSemaforo);
		
//		objSemaforo.setEstado(new EstadoNaranja());
		objSemaforo.mostrar();
//		objSemaforo.setEstado(new EstadoRojo());
		objSemaforo.mostrar();

	}

}
