package ArrayList_prgm;

import java.util.ArrayList;
public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee nani = new Employee ("Nani",123,34000.6,1,"sql developer","Hyderabad",'M');
		nani.displayEmpDetails();
		System.out.println("*********************");
		
		Employee shiva = new Employee ("Shiva",456,26000.6,1,"web developer","Chennai",'M');
		shiva.displayEmpDetails();
		System.out.println("*********************");
		
		Employee nikki = new Employee ("Nikki",987,40000.2,1,"Java developer","Banglore",'F');
		nikki.displayEmpDetails();
		System.out.println("*********************");
		
		ArrayList a1 = new ArrayList();
		a1.add(nani);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(shiva);
		System.out.println(a2);
		
		ArrayList a3 = new ArrayList();
		a3.add(nikki);
		System.out.println(a3);
	}
}
class Employee 
{
	
		String empName;
		int empId;
		double empSalary;
		int empExp;
		String empDesignation;
		String empLoc;
		char empGen;
		public Employee(String empName, int empId, double empSalary, int empExp, String empDesignation, String empLoc,
				char empGen) 
		{
			
			this.empName = empName;
			this.empId = empId;
			this.empSalary = empSalary;
			this.empExp = empExp;
			this.empDesignation = empDesignation;
			this.empLoc = empLoc;
			this.empGen = empGen;
		}
		
		@Override
		public String toString() 
		{
			return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + ", empExp="
					+ empExp + ", empDesignation=" + empDesignation + ", empLoc=" + empLoc + ", empGen=" + empGen + "]";
		}
		public void displayEmpDetails()
		{
			System.out.println("EmpName: "+empName);
			System.out.println("EmpId : "+empId);
			System.out.println("EmpSalary: "+empSalary);
			System.out.println("EmpExp: "+empExp);
			System.out.println("EmpDesignation: "+empDesignation);
			System.out.println("EmpLoc: "+empLoc);
			System.out.println("EmpGen: "+empGen);
		}
		
		
	
}
