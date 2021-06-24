package Multilevelinheritance;



public class stuDetails {

static int id;
	
static String name, add, phno;
	
	stuDetails(int stu_id, String name, String add, String ph_no){
		
	this.id=stu_id;
	
	this.name= name;
		
	this.add= add;
		
	this.phno=ph_no;
	
			
	}
  
	public static void details() {
		System.out.println("Id:"+id+"\nname:"+name+"\nAddress:"+add+"\nPh-No:"+phno+"\n");
	}

public static void main(String[] args)
{
	System.out.println("Students Data:\n");
	
	stuDetails obj1= new stuDetails(1927,"Navi","Ranui","0221912708");
	
	obj1.details();
	
	

}

}
