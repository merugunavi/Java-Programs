package hieraricalinheritance;

public class Son extends Father {
	
	static void myDetails(String name, String add){
		
		int age=32;
		
		System.out.println("\nMy Details:\n"+"Age-"+age+"\nName-"+name+"\nAddress-"+add);

		System.out.println("I got only 1 property in India");
		
	}
public static void main(String args[]) {
	
	Father obj=new Father();
	obj.properties();
	myDetails("Naresh","Sangareddy");
}
}
