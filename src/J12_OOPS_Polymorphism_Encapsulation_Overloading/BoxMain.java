package J12_OOPS_Polymorphism_Encapsulation_Overloading;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Box b=new Box();  //1
		
//		Box b=new Box(10.0,20.5,30.0);  //2
	
		//Box b=new Box(10.5);  //3
		
		System.out.println(b.volume());
	}

}
