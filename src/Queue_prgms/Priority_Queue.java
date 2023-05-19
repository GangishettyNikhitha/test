package Queue_prgms;

import java.util.PriorityQueue;

public class Priority_Queue 
{
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue<>();
		p.add(67);
		p.add(100);
		p.add(1);
		p.add(45);
		p.add(25);
		p.add(13);
		p.add(99);
		p.add(46);
		p.add(78);
		p.add(2);
		p.add(96);
		p.add(7);
		System.out.println(p);
		System.out.println("length: "+p.size());
		System.out.println(p.poll());
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.remove(45));
		System.out.println(p);
		System.out.println("Length: "+p.size());
		
	}
}
