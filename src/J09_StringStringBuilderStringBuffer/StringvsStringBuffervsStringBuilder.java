package J09_StringStringBuilderStringBuffer;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String - immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s);  //welcome
		
		//StringBuffer - mutable
		StringBuffer sb=new StringBuffer("welcome");
		sb.append("to java");
		System.out.println(sb);  //welcometo java
		
		
		//StringBuilder - mutable
		StringBuilder sb1=new StringBuilder("welcome");
		sb1.append("to java");
		System.out.println(sb1);  //welcometo java 
		

	}

}
