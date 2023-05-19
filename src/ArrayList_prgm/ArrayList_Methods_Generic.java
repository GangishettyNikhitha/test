package ArrayList_prgm;

import java.util.ArrayList;

public class ArrayList_Methods_Generic
{
	public static void main(String[] args) 
	{
		ArrayList<Character> a = new ArrayList();
		a.add('J');
		a.add('A');
		a.add('V');
		a.add('A');
		a.add('L');
		a.add('I');
		a.add('B');
		a.add('R');
		a.add('A');
		a.add('R');
		a.add('Y');
		a.add(null);
		System.out.println(a);
		//CHECKING WHETHER PARTICULAR OBJECT IS PRESENT OR NOT:
		System.out.println(a.contains('Y'));
		//RETURN PARTICULAR OBJECT BASED INDEX POSITION:
		System.out.println(a.get(5));
		//REPLACING PARTICULAR character BASED ON PARTICULAR INDEX:
		System.out.println(a.set(0,'K'));
		System.out.println(a);
		//CHECKING WHETHER THE COLLECTION IS EMPTY OR NOT:
		System.out.println(a.isEmpty());
		//RETURNING LENGTH OF THE COLLECTION:
		System.out.println(a.size());
		//ADDING NEW OBJECT ON PARTICULAR INDEX:
		a.add(12,'J');
		System.out.println(a); 
		//REMOVING PARTICULAR OBJECT BASED ON INDEX POSITION:
		System.out.println(a.remove(4));
		System.out.println(a);
		System.out.println(a.size());
		//CLEARING THE COLLECTION:
		a.clear();
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		
	}
}
