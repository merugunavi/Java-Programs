package conditionalPrograms;
// while condition using parameterized constructor
public class Whilecondition {

	Whilecondition(int num, int i){
		
while(i<=10){
	System.out.println( num*i);
	i++;	
}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Whilecondition obj= new Whilecondition(90,1);

}

}
