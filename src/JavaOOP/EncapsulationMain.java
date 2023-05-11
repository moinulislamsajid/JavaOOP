package JavaOOP;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Encapsulation ob = new Encapsulation();
		ob.set_information("Ayman Sajid");
		System.out.println("Your Name : "+ob.get_information());
		
		ob.set_info(20);
		System.out.println("Your Age : "+ob.get_info());
	}

}

