package Assignmants;

public class P24_RemoveJunkOrSpecialCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="xn468B63@#$%^&VHvgh$%^&*BHJJ3264B%^&**(@!@#)^&";
		
		System.out.println(s);
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
