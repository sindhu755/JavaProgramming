package J19_Upcasting_Downcasting;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

//Cat ct=(Cat) an;
//A   B    C   D


public class TypeCastingObjects2 {

	public  static void main(String[] args) {
		
	
		//Rule1 - conversion is valid or not
		//type of D and C must have some relationship(either parent to child or child to parent)
		
		/*Animal an=new Dog();
		Cat ct=(Cat) an;  //valid as per rule1
		
		Dog dg=new Dog();
		Cat ct=(Cat) dg; //invalid as per rule1
		*/
		
		
		
		//Rule2 - assignment valid or not
		//C must be either same or child of A
		
		/*Animal an=new Dog();
		Cat ct=(Cat) an;  //valid as per rule2
		
		Animal dg=new Dog();
		Cat ct=(Dog) an; //invalid as per rule2
		*/
		
		
		//Rule3 - underlying object type of D must be either same or child of C
		
		//Animal an=new Dog();
		//Cat ct=(Cat) an;  //invalid as per rule3
		
		
		//Rule1, Rule2 and Rule3
		
		Animal an=new Dog();
		Dog dg=(Dog) an; //valid as per all rules
		
	
	}

}
