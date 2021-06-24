package singleinheritance;

public class results extends studentdetails{
	static void stu_Info(int m1,int m2, int m3) {
		int	total=m1+m2+m3;
		if(total>90) {
			System.out.println("\n\nTotal marks="+total+"\nResult is Pass");
					
		}
		else {
			System.out.println("\n\nTotal marks="+total+"\n Results is Fail");
			
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			stuinfo();
		    stu_Info(67,80,74);

		}

	
}
