package J18_ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {


		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block handled exception");
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("finally block always execute");
		}
		
		
		System.out.println("program finished");
		

	}

}
