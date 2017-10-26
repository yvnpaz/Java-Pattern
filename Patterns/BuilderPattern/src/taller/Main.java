package taller;

import builder.BuildBaseCar;
import builder.BuildMediumCar;
import builder.BuildTotalCar;
import builder.BuilderCar;
import entities.Car;
import tallerGarage.TallerGarage;

public class Main {

	public static void main(String[] args) {
		// Crear el objeto Director
        TallerGarage taller = new TallerGarage();
        
       // Crear los objetos ConcreteBuilder
        BuilderCar base  = new BuildBaseCar();
        BuilderCar medio = new BuildMediumCar();
        BuilderCar full  = new BuildTotalCar();
       
        // Construir un coche con equipamiento base
        taller.build( base );
        Car carBase = base.getCar();
        
       // Construir un coche con equipamiento medio
       taller.build(medio);
       Car carMedium = medio.getCar();
    		   
       // Construir un coche con equipamiento full
       taller.build( full );
       Car carFull = full.getCar();
       
       // Mostrar la información de cada coche creado
       showCharacteristics( carBase );
       showCharacteristics( carMedium );
       showCharacteristics( carFull );
   }
   // --------------------------------
   public static void showCharacteristics( Car car)
   {
       System.out.println( "Motor: " + car.getEngine() );
       System.out.println( "Carrocería: " + car.getBodywork() );
       System.out.println( "Elevalunas eléctrico: " + car.getPowerWindows() );
       System.out.println( "Airea acondicionado: " + car.getAirConditioner() );
       System.out.println("===================================");
   }
}
