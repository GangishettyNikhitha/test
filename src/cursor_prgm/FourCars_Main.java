package cursor_prgm;

import java.util.ArrayList;
import java.util.Iterator;


public class FourCars_Main 
{
	public static void main(String[] args) 
	{
		Car audi = new Car("Audi",120.5,20);
		Car bmw = new Car("BMW",180.0,45);
		Car nano = new Car("Nano",40,5);
		Car ferrai = new Car("Ferrari",97,30);
		ArrayList a = new ArrayList();
		a.add(audi);
		a.add(bmw);
		a.add(nano);
		a.add(ferrai);
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			Object o = i.next();
			if(o.equals(audi))
			{
				Car c1 = (Car)o;
				c1.displayTime();
			}
			if(o.equals(bmw))
			{
				Car c2 = (Car)o;
				c2.displayTime();
			}
			if(o.equals(nano))
			{
				Car c3 = (Car)o;
				c3.displayTime();
			}
			if(o.equals(ferrai))
			{
				Car c4 = (Car)o;
				c4.displayTime();
			}
		}
		
	}
}
class Car
{
	String brand;
	double speed;
	double distance;
	public Car(String brand, double speed, double distance) 
	{	
		this.brand = brand;
		this.speed = speed;
		this.distance = distance;
	}
	public void displayTime()
	{
		System.out.println("Time Taken by Car: "+distance/speed);
	}
}
