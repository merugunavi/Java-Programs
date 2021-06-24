package methods;

public class operationMethods {
	/*operationMethods(int n1, int n2, int n3) {
	
	int total =n1+n2+n3;
				
		System.out.println("Addition of three numbers="+total);
		
}*/
	
	
static void add(int n1, int n2, int n3) {
		
		int total=n1+n2+n3;
		
		System.out.println("Addition of three numbers="+total);
		
}
	static void sub(int n1, int n2) {
		
		int sub=n1-n2;
		
		System.out.println("Substraction of two numbers="+sub);
		
	}
	
	static void mul(int n1, int n2, int n3) {
		
		int mul=n1*n2*n3;
		
		System.out.println("Multiplication of two numbers="+mul);
		
	}
	static void div(int n1, int n2) {
		
		int div=n1/n2;
		
		System.out.println("Division of two numbers="+div);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//operationMethods obj=new operationMethods(5,5,5);
//obj.operationMethods();

		
add(50,30,40);
sub(58,34);
mul(15,5,10);
div(80,4);
	}
	





}
