package JavaOOP;

public class callbyreferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callbyreference hey = new callbyreference();
		hey.name = "Samiur Rahman";
		System.out.println("Brfore Calling : "+hey.name);
		
		hey.change(hey);
		System.out.println("After Calling : "+hey.name);

		

	}

}
