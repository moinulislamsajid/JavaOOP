package JavaOOP;

public class MethodOverloading {
	void add() {
		System.out.println("There is a no valus");
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b, int c) {
		System.out.println(b+c);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}

}
