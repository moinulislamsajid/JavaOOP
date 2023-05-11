package JavaOOP;

public class Super_Keyword_Consturctor {
	String name;
	double weight;
	// create constructor
	Super_Keyword_Consturctor(String name,double weight){
		this.name = name;
		this.weight = weight;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Weight : "+weight);
	}

}
