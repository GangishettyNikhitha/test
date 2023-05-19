package LinkedList_prgm;

import java.util.LinkedList;

public class Laptop_prgm 
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(new Laptop("Hp","Sliver",63000.0,"1TB"));
		Object  o = l.get(0);
		Laptop lp = (Laptop)o;
		System.out.println(lp.brand);
		System.out.println(lp.color);
		System.out.println(lp.memory);
		System.out.println(lp.price);
	}
}
class Laptop
{
	String brand;
	String color;
	double price;
	String memory;
	public Laptop(String brand, String color, double price, String memory) 
	{
		this.brand = brand;
		this.color = color;  
		this.price = price;
		this.memory = memory;
	}
	
}
