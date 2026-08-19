package J11_OOPS_MethodsAndConstructors;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Student st=new Student();
		
		//1) using object reference variable
		/*st.sid=100;
		st.sname="david";
		st.grade='A';
		st.printData();
		*/
		
		//2) using method
//		st.setStudentData(100, "david",'A');
//		st.printData();
		
		//3) using constructor
		Student st=new Student(100,"john",'A');
		st.printData();
	}

}
