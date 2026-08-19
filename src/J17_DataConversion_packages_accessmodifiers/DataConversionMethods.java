package J17_DataConversion_packages_accessmodifiers;

public class DataConversionMethods {
	
	
	public static void main(String[] args) {
		
		//string ->int,double,boolean
		
		System.out.println("-------String to premitive types---------------");
		
//		String s="welcome";  //can not convert because it is not in a number format
		
		//string -> int  
		
		String s1="10";
		String s2="20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		

		//String -> double
		
		String s3="10.5";
		String s4="20.0";
		
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		
		//string -> boolean
		
		String s="true";  //other than true, if we pass any string that will return false
		
		System.out.println(Boolean.parseBoolean(s));
		
		
		//int,double,char,boolean -> string
		
		System.out.println("-------premitive to string---------------"); 
		
		int a=10;
		double b=10.5;
		char c='A';
		boolean d=true;
		
		s=String.valueOf(a);
		System.out.println(s);
		
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		
		
	}

}
