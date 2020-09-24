package garage;

public class Car extends Vehicle{
	
	public int doors;
	public int seats;
	
	public Car(String reg, String Owner, String make, String model, int age, int doors, int seats)
	{
		this.reg = reg;
		this.owner = Owner;
		this.make = make;
		this.model = model;
		this.age = age;
		this.wheelSize = 'm';
		this.doors = doors;
		this.seats = seats;
	}
	public String getReg()
	{
		return this.reg;
	}
	public String getOwner()
	{
		return this.owner;
	}
	public String getMake()
	{
		return this.make;
	}
	public String getModel()
	{
		return this.model;
	}
	public int getAge()
	{
		return this.age;
	}
	public char getWheelSize()
	{
		return this.wheelSize;
	}
	@Override
	public int getDoors()
	{
		return this.doors;
	}
	@Override
	public int  getSeats()
	{
		return this.seats;
	}
	@Override
	public double calculateCost()
	{
		double cost = 0;
		cost = 40 + 5 * this.doors + 5 * this.seats;
		System.out.println("The cost of fixing "+ this.owner + "s car is £" + cost);
		return cost;
	}
}
