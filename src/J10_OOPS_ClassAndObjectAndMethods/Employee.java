package J10_OOPS_ClassAndObjectAndMethods;

public class Employee 
{

	//variables
	int eid;
	String name;
	String job;
	int sal;
	
	//methods
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}

	
	/*public static void main(String[] args) 
	{

		Employee emp1=new Employee();  //object
		emp1.eid=100;
		emp1.name="john";
		emp1.job="trinee";
		emp1.sal=10000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=101;
		emp2.name="scott";
		emp2.job="trinee";
		emp2.sal=15000;
		
		emp2.display();
		
		

	}
	*/
}
