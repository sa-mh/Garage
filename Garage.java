package garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> Garage1 = new ArrayList<>();

	
	public ArrayList<Vehicle> createGarage()
	{
		Vehicle truck1 = new Truck("YY22 YYY", "Judy", "Ford", "Truckname", 15, 12, false);
		Vehicle car1 = new Car("XX11 XXX", "Dave", "Mini", "Cooper", 10, 3, 5);
		Vehicle bike1 = new Bike("ZZ33 ZZZ", "Burt", "Honda", "Bikename", 1, false, true);
		
		Garage1.add(car1);
		Garage1.add(truck1);
		Garage1.add(bike1);
		
		return Garage1;
	}
	
	public void addVehicle(String reg, String Owner, String make, String model, int age, int wheels, boolean cabinBed)
	{
		Vehicle truck2 = new Truck(reg, Owner, make, model, age, wheels, cabinBed);
		Garage1.add(truck2);
	}
	public void addVehicle(String reg, String Owner, String make, String model, int age, boolean window, boolean sidecar)
	{
		Vehicle bike2 = new Bike(reg, Owner, make, model, age, window, sidecar);
		Garage1.add(bike2);
	}
	public void addVehicle(String reg, String Owner, String make, String model, int age, int doors, int seats)
	{
		Vehicle car2 = new Car(reg, Owner, make, model, age, doors, seats);
		Garage1.add(car2);
	}
	
	
	public void calculateCost(ArrayList<Vehicle> garage)
	{
		
		for(Vehicle vehicle: garage)
		{
			vehicle.calculateCost();
		}
	}

	
	public void emptyGarage()
	{
		Garage1.clear();
		System.out.println("The garage has been emptied");
	}
	
	public void removeVehicle(String reg)
	{
		int i = 0;
		boolean removeVehicle = false;
		for(Vehicle transport: Garage1)
		{
			if(transport.getReg().equals(reg))
			{
				System.out.println(transport.getOwner() + "s vehicle has been removed from the garage");
				removeVehicle = true;
				break;
			}
			i++;
		}
		if(removeVehicle)
		{
			Garage1.remove(i);
		}
		
	}
	
	public void removeVehicles(char type)
	{
		ArrayList<Vehicle> leaving = new ArrayList<>();
		if(type == 't' || type == 'T')
		{
			for(Vehicle transport: Garage1)
			{
				if(transport instanceof Truck)
				{
					System.out.println(transport.getOwner() + "s truck has been removed from the garage");
					leaving.add(transport);
				}
			}
		}
		else if(type == 'c' || type == 'C')
		{
			for(Vehicle transport: Garage1)
			{
				if(transport instanceof Car)
				{
					System.out.println(transport.getOwner() + "s car has been removed from the garage");
					leaving.add(transport);
				}
			}	
		}
		else if(type == 'b' || type == 'B')
		{
			for(Vehicle transport: Garage1)
			{
				if(transport instanceof Bike)
				{
					System.out.println(transport.getOwner() + "s bike has been removed from the garage");
					leaving.add(transport);
				}
			}
		}
		else
		{
			System.out.println("Vehicle type unknown.");
		}
		Garage1.removeAll(leaving);
	}
	
	
	
}
