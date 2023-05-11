package JavaOOP;

public class StaticBlock {

	static int id;
	static String name;
	// create a static block because this static block has initialization the static variable
	static {   // here is a static block
		id = 101;
		name = "Ayman Sajid";
	}
	static void display_information() {
		
		System.out.println("Your Name : "+name);
		System.out.println("Your Id : "+id);
	}
	
}
