package methodOverriding;

public class Addition {
	int a=15,b=10;
	int c=a+b;

	public void prg() {
		System.out.println("This is my addition prg of 15+10="+c);
}
public static void main(String args[]) {
	Addition a=new Addition();
	a.prg();
}
 

}
