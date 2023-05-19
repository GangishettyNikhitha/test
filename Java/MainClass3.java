interface Laptop
{
	void screen();
}
class Desktop implements Laptop
{
	public void screen()
	{
		System.out.println("Destop displays screen");
	}
}
class Keyboard implements Laptop
{
	public void screen()
	{
		System.out.println("Keyboard is to type");
	}
}

class Mouse implements Laptop
{
	public void screen()
	{
		System.out.println("Mouse is conneted to laptop");
	}
}
class MainClass3 
{
	public static void display(Laptop laptop)
	{
		laptop.screen();
	}
	public static void main(String[] args) 
	{
		display((Laptop)new Desktop());
		display((Laptop)new Keyboard());
		display((Laptop)new Mouse());
	}
}
