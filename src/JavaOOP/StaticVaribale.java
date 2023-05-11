package JavaOOP;

public class StaticVaribale {
	String name;
	int id;
	// declaring static variable because free space some memory 
	// static variable connected to class can not connected to object
	// static variable refer to class that way some free space connected
	
	// there are two type instance variable and static or class variable 
	
	static String university_name ="DIU"; // static and data type and variable name than value
	
	// declaring constructor
	StaticVaribale(String n,int i){
		name = n;
		id = i;
	}
	void information_print() {
		System.out.println("Name : "+name);
		System.out.println("Id Number : "+id);
		System.out.println("University Name : "+university_name);
		System.out.println("\n\n");
	}
}