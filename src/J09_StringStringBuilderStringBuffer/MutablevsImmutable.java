package J09_StringStringBuilderStringBuffer;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//mutable-can change
		int a[]= {4,7,2,6,3};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		//immutable - can not change
		String s=new String("welcome");
		
		s.concat("to java");
		System.out.println(s);  //welcome
		
		String concat=s.concat("to java");
		System.out.println(concat);  //welcometo java

	}

}
