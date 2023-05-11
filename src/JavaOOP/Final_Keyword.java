package JavaOOP;

public class Final_Keyword {
	final String University = "DIU"; // this is final variable
	final int fees; // this variable name is >> blank final variable
	static final int established; // this is static final variable  
	Final_Keyword(int fees){
		this.fees = fees;
		// alternative way to initialization blank final variable
		// fees = 2020202002;
	}
	static{
		established = 1995;
	}
	
	void display() {
		//University = "NSU"; > cannot use this university variable name because this variable name is final declared  
		System.out.println("University Name : "+University);
		System.out.println("Fees : "+fees);
		System.out.println("Established : "+established);
	}

}
