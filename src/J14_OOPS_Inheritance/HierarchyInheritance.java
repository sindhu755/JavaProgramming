package J14_OOPS_Inheritance;
//
//
//class Parent
//{
//	void display(int a)
//	{
//		System.out.println(a);
//	}
//}
//
//
//class Child1 extends Parent
//{
//	void show(int b)
//	{
//		System.out.println(b);
//	}
//}
//
//
//class Child2 extends Parent
//{
//	void print(int c)
//	{
//		System.out.println(c);
//	}
//}
//
//
//public class HierarchyInheritance {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Child1 c1=new Child1();
//		c1.display(100);
//		c1.show(200);
//		
//		
//		Child2 c2=new Child2();
//		c2.display(300);
//		c2.print(400);
//		
//
//	}
//
//}


class Parent 
{
    
       int a=10;
       
       void m1()
       {
           System.out.println(a);
       }
}

class Child extends Parent
{
    int b=20;
    
    void m2()
    {
        System.out.println(b);
    }
}

class HierarchyInheritance 
{
    public static void main(String[] args) {
        Child c=new Child();
        c.m1();
        c.m2();
    }
    
    
    
}
