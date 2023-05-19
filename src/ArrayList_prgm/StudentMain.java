package ArrayList_prgm;

import java.util.ArrayList;

public class StudentMain 
{
	public static void main(String[] args) 
	{
		Student ram = new Student("Ram",123,90.5,true,'M');
		Student sita = new Student("sita",321,89.5,true,'F');
		ArrayList a1 = new ArrayList();
		a1.add(ram);
		a1.add(sita);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(0));
		System.out.println(a1.set(0, new Student("Laxman",456,77.7,true,'M')));
		System.out.println(a1);
		a1.add(2,new Student("Ravan",678,35.8,false,'M'));
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		a1.clear();
		System.out.println(a1);
		a1.add(new Student("Hanuman",100,99.9,true,'M'));
		System.out.println(a1);
		
	}
}
