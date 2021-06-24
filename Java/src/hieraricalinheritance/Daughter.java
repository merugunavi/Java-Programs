package hieraricalinheritance;

public class Daughter extends Father {
	
	static void myDetails(int age,String name, String add){
		
	
		
		System.out.println("\nMy Details:\n"+"Age-"+age+"\nName-"+name+"\nAddress-"+add);

		System.out.println("I got 2 properties one is in India and the other is in Auckland");
		
	}
public static void main(String args[]) {
	
	Father obj=new Father();
	obj.properties();
	myDetails(30,"Navitha","Auckland");
}
}
