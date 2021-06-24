package methodOverriding;

public class Substraction extends Addition{
	int	c=a-b;
	
	public void prg() {
		
		System.out.println("This is the substraction program calling the values from addition prg:"+c);
 
	}
	public void totprg() {
		prg();
		super.prg();
		
	}
	
public static void main(String args[]) {
	Substraction sb=new Substraction();
	sb.totprg();
	
}
}
