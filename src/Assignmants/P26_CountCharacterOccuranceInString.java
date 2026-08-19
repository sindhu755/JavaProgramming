package Assignmants;

public class P26_CountCharacterOccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="welcome to java programming";
		
		int total_len=s.length();
		int total_lenAfetRemove=s.replace("j","").length();
		
		int count=total_len-total_lenAfetRemove;
		
		System.out.println(count);

	}

}
