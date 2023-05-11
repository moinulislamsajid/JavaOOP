package JavaOOP;

public class Super_Constructor_inherit extends Super_Constructor {

	Super_Constructor_inherit(){
		// declaring constructor super keyword
		super(); // if any parameter in base class than you can use this child constructor parameter
		System.out.println("This is Second Constructor");
	}
}
