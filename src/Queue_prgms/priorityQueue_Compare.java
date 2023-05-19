package Queue_prgms;

import java.util.PriorityQueue;

public class priorityQueue_Compare 
{
	public static void main(String[] args) 
	{
		PriorityQueue p1 = new PriorityQueue();
		p1.add(67);
		p1.add(7);
		p1.add(69);
		p1.add(57);
		p1.add(79);
		PriorityQueue p2 = new PriorityQueue();
		p1.add(7);
		p1.add(78);
		p1.add(9);
		p1.add(5);
		p1.add(49);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.equals(p2));
		
		
	}
}
