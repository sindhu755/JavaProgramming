package J12_OOPS_Polymorphism_Encapsulation_Overloading;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account ac=new Account();
		
		
		ac.setAccno(100);
		ac.setName("sindhu");
		ac.setAmount(1000.4);
		
		
		System.out.println(ac.getAccno());
		System.out.println(ac.getName());
		System.out.println(ac.getAmount());
		
	}

}
