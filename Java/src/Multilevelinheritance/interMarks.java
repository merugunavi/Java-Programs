package Multilevelinheritance;

public class interMarks extends schoolMarks{
	
	
	public static void intermarks(int total){
		
		System.out.println("Toatl marks of the student in Intermediate="+total);
		
	}
public static void main(String args[]) {
	interMarks.details();
	interMarks.marks(45,78,97);	
	intermarks(490);
}
}
