package ArrayList_prgm;

import java.util.ArrayList;

public class ArrayList_String 
{
	public static void main(String[] args) 
	{
		 ArrayList<String> a = new ArrayList();
		 a.add("Nikki");
		 a.add("priya");
		 a.add("Lekhya");
		 a.add("Akanksha");
		 System.out.println(a);
		 
		 String[] s = a.toArray(new String[a.size()]);
		 for (int i=0;i<=a.size()-1;i++)
		 {
			 s[i]=a.get(i);
		 }
		 for(int i=0;i<=s.length-1;i++)
		 {
			 System.out.println(s[i]);
		 }
	}
}
