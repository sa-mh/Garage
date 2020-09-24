package garage;

public abstract class Vehicle {
	
	protected String reg;
	protected String owner;
	protected String make;
	protected String model;
	protected int age;
	protected char wheelSize;
	
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
	public int getDoors()
	{
		return 0; //overridden
	}

	public int  getSeats()
	{
		return 0; //overridden
	}
	public boolean getWindow()
	{
		return false; //overridden
	}
	public  boolean getSideCar()
	{
		return false; //overridden
	}
	public int getWheels()
	{
		return 0; //overridden
	}
	public boolean getBed()
	{
		return false; //overridden;
	}

	
	public abstract double calculateCost();

}
