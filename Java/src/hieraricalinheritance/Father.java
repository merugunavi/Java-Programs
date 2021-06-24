package hieraricalinheritance;

public class Father {
int age;
	
	Father() {
	
	int age=65;
	String fname="Ramulu";
	String address="Hyderabad";
	
	System.out.println("My Father Details:\n"+"Age-"+age+"\n"+"Name-"+fname+"\n"+"Address-"+address);
	
}
//static void properties() or
void properties(){
	System.out.println("My Father got 2 properties in India");

}
public static void main(String args[]) {
	//new Father();
	//properties(); or
	Father obj=new Father();
	obj.properties();
}
}
