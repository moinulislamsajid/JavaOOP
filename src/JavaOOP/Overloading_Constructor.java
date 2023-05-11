package JavaOOP;

public class Overloading_Constructor {
		String name,gender;
		int age;
		// declaring default constructor
		Overloading_Constructor(){
			System.out.println("No Information");
			
		}
		// constructor cannot at same parameter at same program
		Overloading_Constructor(String n,String gen){
			name = n;
			gender = gen;
			
		}
		Overloading_Constructor(String n,String gen,int a){
			name = n;
			gender = gen;
			age = a;
		}
		void information_printing() {
			System.out.println("Name : "+name);
			System.out.println("Gender : "+gender);
			System.out.println("age  : "+age);
			System.out.print("\n\n");



		}
}
