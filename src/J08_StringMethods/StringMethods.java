package J08_StringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Welcome";  //creating string variable
		//String s1=new String("welcome");
		System.out.println(s); 
		
		
		//length()
		int l=s.length();    //length of string return type is int
		System.out.println(s.length());
		System.out.println(l);
		
		
		//concat()
		String s1="hello";
		String s2="hello";
		String s3="programming";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		
		System.out.println("hello"+"world");
		System.out.println("hello".concat("world"));
		
		
		//trim() - remove spaces right and left side
		String a="   welcome   ";
		System.out.println(a);
		System.out.println("before trimming:"+a.length());
		
		System.out.println(a.trim());
		System.out.println("after trimming:"+a.trim().length());
		
		
		//charAt() -returns character based on index
		String c="welcome";
		System.out.println(c.charAt(6));
		System.out.println(c.charAt(0));
		
		
		//contains() -returns true or false
		System.out.println(c.contains("wel"));  //true
		System.out.println(c.contains("welme"));  //false
		System.out.println(c.contains("COME"));  //false
		System.out.println(c.contains("Wel"));  //false
		
		
		//equals(), equalsIgnoreCase()  -  compare strings
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals("Hello"));
		System.out.println(s1.equalsIgnoreCase("Hello"));
		
		
		//replace() - replace single or multiple(sequence) of character in a string
		String ss="welcome to java selenium python selenium";
		System.out.println(ss.replace('e', 'E'));
		System.out.println(ss.replace("selenium","Playwrite"));
		
		
		//substring() - it will extract substring from the main string
		String x="selenium";
		System.out.println(x.substring(1,3));
		System.out.println(x.substring(0,5));
		
		
		//toUpperCase()  and toLowerCase()
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		
		
		//split() - split the string into multiple parts based on delimiter
		String b="abc@gmail.com";
		String a1[]=b.split("@");
		
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(Arrays.toString(a1));
		
		//ex1
		String amount="$65,78,87";
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		//ex2
		String email="abc,123@xtz";
		
		String arr1[]=email.split(",");
		System.out.println(Arrays.toString(arr1));  //[abc, 123@xtz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));  //[123, xtz]
		
//		String arr2[]=email.split("@");   //[abc, 123, xtz]
//		System.out.println(Arrays.toString(arr2));
				
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		
		//ex3
		String ab="abc 123";
		String array[]=s.split(" ");
		System.out.println(Arrays.toString(array));
		
		
		// *  %  ^  &  (  )  -  you cannot use as delimeters
		
		//ex4
		String name="John kenedy";
		System.out.println(name.contains("john"));  //false
		
		System.out.println(name.replace("J", "j").contains("john"));  //true
		System.out.println(name.toLowerCase().contains("john"));  //true
		
		
		
	}

}
