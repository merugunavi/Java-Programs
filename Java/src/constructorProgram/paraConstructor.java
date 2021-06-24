package constructorProgram;

public class paraConstructor {
	int id;
	String name;
	String address;
		
paraConstructor(int stu_id, String stu_name, String stu_add){
	this.id= stu_id;
	this.name= stu_name;
	this.address = stu_add;
	
}
void stuDetails(){
	System.out.print("Student information:\n" +id+"\n"+name+"\n"+address );
}
public static void main(String args[]) {

	paraConstructor obj= new paraConstructor(123,"navi","ranui");
	obj.stuDetails();
}
}
