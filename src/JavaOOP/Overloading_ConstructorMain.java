package JavaOOP;

public class Overloading_ConstructorMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_Constructor human1 = new Overloading_Constructor();
		human1.information_printing();
		
		Overloading_Constructor human2 = new Overloading_Constructor("Ayman Sajid","Male");
		human2.information_printing();
		
		Overloading_Constructor human3 = new Overloading_Constructor("Samiur Rahman Sakib","Male",18);
		human3.information_printing();
		
		

	}

}
