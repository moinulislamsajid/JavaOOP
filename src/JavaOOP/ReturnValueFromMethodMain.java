package JavaOOP;

public class ReturnValueFromMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnValueFromMethod result = new ReturnValueFromMethod();
		int answer = result.Square(5);
		System.out.println("Here Answer is : "+answer);
		ReturnValueFromMethod local = new ReturnValueFromMethod();
		int hey = local.Square(10);
		System.out.println("Answer is : "+hey);
		
		
	}

	

}
