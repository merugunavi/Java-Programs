package abstractClass;

class Addition extends OperationalMethods{
	public  void prg(int a,int b) {
			int c=a+b;
		System.out.println("addition of two nums:"+c);
	}
public static void main(String args[]) {
	
	Addition obj=new Addition();
	obj.prg(18,2);
	
}
}
