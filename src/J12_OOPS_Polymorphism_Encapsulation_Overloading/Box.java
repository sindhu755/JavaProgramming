package J12_OOPS_Polymorphism_Encapsulation_Overloading;

public class Box {
	
	double width,height,depth;
	
	Box()//1  default constructor
	{
		
		/*width=0;
		height=0;
		depth=0; */
		
		width=height=depth=0;
	}
	
	Box(double w,double h,double d)  //2 parameterized
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box(double len)  //3  parameterized
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		
		return width*height*depth;
	}
	
}
