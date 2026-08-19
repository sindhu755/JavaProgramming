package J12_OOPS_Polymorphism_Encapsulation_Overloading;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder obj=new Adder();
		
		obj.sum(); //1
		
		obj.sum(20,40);  //2
		
		obj.sum(10, 10.5);  //3
		
		obj.sum(20.5, 10); //4
		
		obj.sum(10, 20, 30);  //5
	}

}
