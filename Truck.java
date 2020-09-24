package garage;

public class Truck extends Vehicle{

	private int wheels;
	private boolean cabinBed;
	
	public Truck(String reg, String Owner, String make, String model, int age, int wheels, boolean cabinBed )
	{
		this.reg = reg;
		this.owner = Owner;
		this.make = make;
		this.model = model;
		this.age = age;
		this.wheelSize = 'l';
		this.wheels = wheels;
		this.cabinBed = cabinBed;
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
	public int getWheels()
	{
		return this.wheels;
	}
	@Override
	public boolean getBed()
	{
		return this.cabinBed;
	}
	@Override
	public double calculateCost()
	{
		double cost = 0;
		double charges = 0;
		if(this.cabinBed)
		{
			charges = 30;
		}
		cost = 60 + charges + this.wheels * 7.5;
		System.out.println("The cost of fixing "+ this.owner + "s truck is £" + cost);
		return cost;
	}
	
}
