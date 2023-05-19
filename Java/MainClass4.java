interface Inheritance
{
	void reuseCode();
}
class SingleLevel implements Inheritance
{
	public void reuseCode()
	{
		System.out.println("single super class single sub class");
	}
}
class MultiLevel implements Inheritance
{
	public void reuseCode()
	{
		System.out.println("super class,multi class,sub class");
	}
}
class Hierarchical implements Inheritance
{
	public void reuseCode()
	{
		System.out.println("single super class multiple sub classes");
	}
}
class MainClass4 
{
	public static void reduceRepeat(Inheritance inheritance)
	{
		inheritance.reuseCode();
	}
	public static void main(String[] args) 
	{
		reduceRepeat((Inheritance)new SingleLevel());
		reduceRepeat((Inheritance)new MultiLevel());
		reduceRepeat((Inheritance)new Hierarchical());
	}
}
