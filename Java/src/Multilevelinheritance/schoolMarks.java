package Multilevelinheritance;

public class schoolMarks extends stuDetails {

	schoolMarks(){
		super(1927,"Navi","Ranui","0221912708");
		
		System.out.println("Student Details:");

	}
	public static void marks(int s1, int s2, int s3) {
	
	 int total;
	
	 total=s1+s2+s3;
		
		System.out.println("Total marks of the student in School:"+total);
	}
	public static void main(String args[]) {
		
	
		new schoolMarks();
		
		System.out.println("Id:"+id+"\nname:"+name+"\nAddress:"+add+"\nPh-No:"+phno+"\n");

		marks(45,78,97);	
		
		
	}

	
	
}
