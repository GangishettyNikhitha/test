package ArrayList_prgm;

public class Student 
{
	String stdName;
	int stdRollNo;
	double stdper;
	boolean stdResult;
	char stdGen;
	public Student(String stdName, int stdRollNo, double stdper, boolean stdResult, char stdGen) 
	{	
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdper = stdper;
		this.stdResult = stdResult;
		this.stdGen = stdGen;
	}
	
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdRollNo=" + stdRollNo + ", stdper=" + stdper + ", stdResult="
				+ stdResult + ", stdGen=" + stdGen + "]";
	}
	
	
}