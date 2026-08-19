package J19_Upcasting_Downcasting;

public class TypeCastingObjects3 {

	//A B=(C) D;
	
	public static void main(String[] args) {
		
		//ex1:
//		Object o =new String("welcome");
//		StringBuffer sb=(StringBuffer) o;    //Rule1-passed  Rule2-passed  Rule3-failed                
		

		//ex2:
//		String s =new String("welcome");
//		StringBuffer sb=(StringBuffer) s;  //Rule1-failed               

		
		//ex3:
//		Object o =new String("welcome");
//		StringBuffer sb=(StringBuffer) o;  //Rule1-passed  Rule2-passed  Rule3-failed                

		
//		//ex4:
//		Object o =new String("welcome");
//		StringBuffer sb=(String) o;   //Rule1-passed  Rule2-failed               

		
//		//ex5:
//		String s=new String("welcome");
//		StringBuffer sb=(String) s;    //Rule1-passed  Rule2-failed    
		
		//ex6:
//		Object o=new String("welcome");
//		StringBuffer sb=(StringBuffer) o;  //Rule1-passed  Rule2-passed  Rule3-failed   
		
		//ex7:
		Object o=new String("welcome");
		String s=(String) o;      //Rule1-passed  Rule2-passed  Rule3-passed   
	
		System.out.println(s);
		
	}

}
