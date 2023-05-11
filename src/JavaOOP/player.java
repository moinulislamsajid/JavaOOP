package JavaOOP;

public class player {

	// declaring variable
	String name,gender;
	int number;
	// create default constructor
	player(){
		System.out.println("No Valus");
	}
	// now create parameterized constructor
	player(String n,String gen,int jen){
		name = n;
		gender = gen;
		number = jen;
	}
	/*void player_information(String n,String gen,int jer) {
		name = n;
		gender = gen;
		number = jer;
	}*/
	void information_print() {
		System.out.print("Name : "+name);
		System.out.print("Gender : "+gender);
		System.out.print("Jergey number : "+number);
		System.out.print(" \n\n");



	}
	
	
}
