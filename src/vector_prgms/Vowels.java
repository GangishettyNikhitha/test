package vector_prgms;

import java.util.Vector;

public class Vowels 
{
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<>();
		String s = "Hello";
		for(int i=0;i<=s.length()-1;i++)
		{
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||
					s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||
					s.charAt(i)=='U')
			{
				String temp = ""+s.charAt(i);
				v.add(temp);
			}
		}
		System.out.println(v);
	}
}
