package caldoMasEnvasado;

public class Main {

	public static void main(String[] args) {

		CookFood verzaOfMonte = new PreparedVerza(new PreparedCooked());
		verzaOfMonte.obtain();

		verzaOfMonte.setIProcess(new PreparedPacking());
		verzaOfMonte.obtain();
		
        System.out.println("-------------");
        
        CookFood spinach = new PreparedSpinach(new PreparedCooked());
        spinach.obtain();
        
        spinach.setIProcess(new PreparedPacking());
        spinach.obtain();
        
        System.out.println("-------------");
	}

}
