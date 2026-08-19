package Assignmants;

public class P25_RemoneWhiteSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome  to java programming";
		
		System.out.println("Before removing white spaces:"+s);
		s=s.replaceAll("\\s", "");
//		s=s.replace(" ", "");
		System.out.println("After removing white spaces:"+s);
	}

}
