package garage;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> myGarage = new ArrayList<>();
		
		Garage createGarage = new Garage();
		
		myGarage = createGarage.createGarage();
		
		createGarage.calculateCost(myGarage);
		
		System.out.println("");
		
		createGarage.addVehicle("zz33 zzz", "Bob", "Fiat", "Truckla", 5, 16, false);
		createGarage.addVehicle("aaa77 aaa", "Dave", "Ford", "Focus", 10, 4, 7);
		createGarage.addVehicle("bb33 bbb", "Anne", "Yamaha", "Bikey", 3, true, true);
		
		createGarage.calculateCost(myGarage);
		System.out.println("");
		
		//createGarage.emptyGarage();
		createGarage.removeVehicle("zz33 zzz");
		System.out.println("");
		createGarage.calculateCost(myGarage);
		System.out.println("");
		createGarage.removeVehicles('b');
		System.out.println("");
		createGarage.calculateCost(myGarage);
		

	}

}
