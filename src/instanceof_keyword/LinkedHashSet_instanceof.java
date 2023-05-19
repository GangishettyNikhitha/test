package instanceof_keyword;

import java.util.LinkedHashSet;

public class LinkedHashSet_instanceof 
{
	public static void main(String[] args) 
	{	
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("hi");
		lh.add(new employee("Dinga",420,15000.3,"Mumbai",0.6));
		lh.add(1);
		for (Object o:lh)
		{
			if (o instanceof employee)
			{
				employee e1 = (employee)o;
				System.out.println(e1.empName);
				System.out.println(e1.empId);
				System.out.println(e1.empSal);
				System.out.println(e1.empLoc);
				System.out.println(e1.empExp);
			}
			if (o instanceof String)
			{
				String s1 = (String)o;
				System.out.println(s1);
			}
			if (o instanceof Boolean)
			{
				Boolean b1 = (Boolean)o;
				System.out.println(b1);
			}
			
		}
		
	}
}
class employee
{
	String empName;
	int empId;
	double empSal;
	String empLoc;
	double empExp;
	public employee(String empName, int empId, double empSal, String empLoc, double empExp) 
	{
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.empLoc = empLoc;
		this.empExp = empExp;
	}
	
	
	
}