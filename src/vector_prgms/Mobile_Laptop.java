package vector_prgms;

import java.util.Collections;
import java.util.Vector;

public class Mobile_Laptop 
{
	public static void main(String[] args) 
	{
		Mobile mobile  =new Mobile("Vivo",15000,"Black");
		mobile.displayMobile();
		System.out.println("*************************");
		
		Laptop laptop = new Laptop("Dell",500000,"Grey");
		laptop.displayLaptop();
		System.out.println("***************************");
		
		//////////////////////////////////
		//Adding objets into collection
		Vector v1 = new Vector();
		v1.add(mobile);
		System.out.println(v1);
		
		Vector v2 = new Vector();
		v2.add(laptop);
		System.out.println(v2);
		
		///////////////////////////////////
		//Replacing objects in 1st vector:
		System.out.println(v1.set(0, new Mobile("Oppo",13000,"Red")));
		System.out.println(v1);
		
		///////////////////////////////////
		//Adding another property into Collection& returning one by one
		v2.add(1,new Laptop("Lenovo",450000,"Black"));
		for (int i=0;i<=v2.size()-1;i++)
		{
			System.out.println(v2.get(i));
		}
		System.out.println(v2);
		
		///////////////////////////////////
		//Swapping 2nd Vector properties:
		Collections.swap(v2, 1, 0);
		System.out.println(v2);
		
		//////////////////////////////////
		//Comparing 2 Vectors:
		System.out.println(v1.equals(v2));
		
		/////////////////////////////////
		//Merging 2 vectors
		v1.add(v2);
		System.out.println(v1);
	}
	
}
class Mobile
{
	String brandName;
	int price;
	String color;
	public Mobile(String brandName, int price, String color) 
	{
		this.brandName = brandName;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ", price=" + price + ", color=" + color + "]";
	}
	public void displayMobile()
	{
		System.out.println("Mobile Brand: "+brandName);
		System.out.println("Mobile price: "+price);
		System.out.println("Mobile color: "+color);
	}
}
class Laptop
{
	String brandName;
	int price;
	String color;
	public Laptop(String brandName, int price, String color) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", price=" + price + ", color=" + color + "]";
	}
	public void displayLaptop()
	{
		System.out.println("Laptop Brand: "+brandName);
		System.out.println("Laptop price: "+price);
		System.out.println("Laptop color: "+color);
	}
}