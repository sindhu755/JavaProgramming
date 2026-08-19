
package J12_OOPS_Polymorphism_Encapsulation_Overloading;
public class Account {
	
	private int accno;
	private String name;
	private double amount;
	
	/*void setAccno(int accno)
	{
		this.accno=accno;
	}

	int getAccno()
	{
		return accno;
	}
	*/
	
	public int getAccno() 
	{
		return accno;
	}

	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}

	
}
