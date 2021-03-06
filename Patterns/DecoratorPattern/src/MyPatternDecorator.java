
public class MyPatternDecorator {

	/**
	 * Todas las pizzas tienen una basePizza 
	 * !!Abstracta:
	 * - no se puede instanciar.
	 * - se implementa para llamar a subclases.
	 * @author EXTypaz
	 */
	public static abstract class BasePizza {

		protected double price;

		public double getPrice() {
			return price;
		}
	}

	/**
	 * Tipos de Pizza
	 * @author EXTypaz
	 */
	public static class Margarita extends BasePizza {

		public Margarita() {
			this.price = 6.99;
		}
	}

	public static class Barbecue extends BasePizza {

		public Barbecue() {
			this.price = 9.50;
		}
	}

	/*********************************************/
	/*********************************************/

	/**
	 * Todas las pizzas tienen un tipo de topping 
	 * !!Abstracta: 
	 * - no se puede instanciar. 
	 * - se implementa para llamar a subclases.
	 * @author EXTypaz
	 */
	public static abstract class ToppingDecorator extends BasePizza {

		protected BasePizza basePizza;

		public ToppingDecorator(BasePizza pizzaToDecorate) {
			this.basePizza = pizzaToDecorate;
		}

		@Override
		public double getPrice() {
			return (this.basePizza.getPrice() + this.price);
		}
	}

	public static class ChickenTopping extends ToppingDecorator {

		public ChickenTopping(BasePizza pizzaToDecorate) {
			super(pizzaToDecorate);
			this.price = 1.20;
		}

	}

	public class ExtraCheeseTopping extends ToppingDecorator {

		public ExtraCheeseTopping(BasePizza pizzaToDecorate) {
			super(pizzaToDecorate);
			this.price = 0.95;
		}

	}

	public static void main(String[] args) {

		BasePizza pizzaM = new Margarita();
		System.out.println("Margarita pizza: "+ pizzaM.getPrice());
		
		BasePizza pizzaB = new Barbecue();
		System.out.println("Barbecue pizza: "+ pizzaB.getPrice());
	}

}
