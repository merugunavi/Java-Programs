package methodOverloading;

public class Addition {

	public static void addition() {
		int n1=45,n2=56,n3=78,total;
		total=n1+n2+n3;
		System.out.println("total of 3 assigned numbers="+total);
	}
	
	public static void addition(int n1, int n2, int n3) {
		
	int total=n1+n2+n3;
	System.out.println("Total of 3 by passing numbers="+total);
	}
	public static void addition(String a, String b) {
		String f=a+ b;
		System.out.println("Fullname of the programmer is:"+f);
	}
	public static void main(String args[]) {
		
		addition();
		addition(34,76,98);
		addition("Navitha","Merugu");
	}
}
