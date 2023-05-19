interface ElectronicDevice
{
	void operation();
}
class Laptop implements ElectronicDevice
{
	public void operation()
	{
		System.out.println("Laptop displays screen");
	}
}  
class Ac implements ElectronicDevice
{
	public void operation()
	{
		System.out.println("Ac blows cool air");
	}
}
class Television implements ElectronicDevice
{
	public void operation()
	{
		System.out.println("Television is to watch");
	}
}
class MainClass2 
{
	public static void battery(ElectronicDevice electronicDevice)
	{
		electronicDevice.operation();
	}
	public static void main(String[] args)
	{
		battery((ElectronicDevice)new Laptop());
		battery((ElectronicDevice)new Ac());
		battery((ElectronicDevice)new Television());

	}
}
