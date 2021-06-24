package conditionalPrograms;

public class Ifcondition {

static int tot;
	
	static void total(int m1, int m2, int m3, int m4) {
	
		tot=m1+m2+m3+m4;

	if(tot>140)	{
		System.out.println("Student result is Pass");
	}else
		{
System.out.println("Result is Fail");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Ifcondition.total(34,54,65,67);
System.out.println("Total marks of the student1="+tot);

Ifcondition.total(34,85,97,54);
System.out.println("Total marks of the student2="+tot);

	}


}
