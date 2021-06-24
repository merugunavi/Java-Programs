package abstractClass;

class Substraction extends OperationalMethods{
	public void prg(int a,int b) {
		int c=a-b;
		System.out.println("Substraction of two nums:"+c);
	}
public static void main(String args[]) {
	
	Substraction obj=new Substraction();
	obj.prg(18,2);
	
}
}
