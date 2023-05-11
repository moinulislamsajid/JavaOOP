package JavaOOP;

public class MethodOverriding1 extends MethodOverriding {
	// Method Overriding
	String University_name;
	@Override
	void display() {
		System.out.println("His Name is : "+name);
		System.out.println("His age : "+age);
		System.out.println("His University Name : "+University_name);
	}

}

