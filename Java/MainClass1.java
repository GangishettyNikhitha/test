//This is Run -time polymorphism
// For every Run-time polymorphism there will be having 5 methods 
//i.e, interface (or) Super class/abstract class , implementation class (or) Sub class , Method overriding,Generalisation,Upcasting
interface Animal
{
	void noise();								// this is interface
}
class Lion implements Animal	// this is implementation class
{
	public void noise()	
	{
		System.out.println("Lion noise");			// this is method overriding
	}
}
class Tiger implements Animal	// this is implementation class
{
	public void noise()
	{
		System.out.println("Tiger noise");		// this is method overriding
	}
}
class Monkey implements Animal	// this is implementation class
{
	public void noise()
	{
		System.out.println("Monkey noise");		// this is method overriding
	}
}
class MainClass1 
{
	public static void makeSound(Animal animal)		// this is generalisation
	{
		animal.noise();
	}
	public static void main(String[] args) 
	{
		makeSound((Animal)new Lion());			//Here it is upcasted
		makeSound((Animal)new Tiger());
		makeSound((Animal)new Monkey());
	}
}
