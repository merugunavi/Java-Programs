package constructorProgram;

public class Stu_info {

	int id;
	
	String name, add, phno;
	
	Stu_info(int stu_id, String name, String add, String ph_no){
		
	this.id=stu_id;
	
	this.name= name;
		
	this.add= add;
		
	this.phno=ph_no;
	
			
	}
  
	void details() {
		System.out.println("Id:"+id+"\nname:"+name+"\nAddress:"+add+"\nPh-No:"+phno+"\n");
	}

public static void main(String[] args)
{
	System.out.println("Students Data:\n");
	
	Stu_info obj1= new Stu_info(1927,"Navi","Ranui","0221912708");
	
	obj1.details();
	
	Stu_info obj2= new Stu_info(3097,"Vihaan","Ranui","167387982");
	
	obj2.details();

	Stu_info obj3= new Stu_info(156,"Vishnu","Henderson","020109873");
	
	obj3.details();
	
	Stu_info obj4= new Stu_info(3097,"Rannika","CBD","557757982");
	
	obj4.details();

}

}
