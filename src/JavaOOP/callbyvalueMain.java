package JavaOOP;

public class callbyvalueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callbyvalue ob = new callbyvalue();
		int y = 100;
		System.out.println("X brfore call : "+y);
		
		ob.change(y);
		System.out.println("X after call : "+y);

		
	}

}
