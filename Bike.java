package garage;

public class Bike extends Vehicle{


	private boolean window;
	private boolean sideCar;
	
	public Bike(String reg, String Owner, String make, String model, int age, boolean window, boolean sidecar )
	{
		this.reg = reg;
		this.owner = Owner;
		this.make = make;
		this.model = model;
		this.age = age;
		this.wheelSize = 's';
		this.window = window;
		this.sideCar = sidecar;
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
	public boolean getWindow()
	{
		return this.window;
	}
	@Override
	public boolean getSideCar()
	{
		return this.sideCar;
	}
	
	
	
}
