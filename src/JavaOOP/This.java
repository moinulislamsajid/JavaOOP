package JavaOOP;

public class This {
	String name;
	int age ;
	String hair_color;
	This(String name,int age){
		this.name = name;
		this.age = age;
	}
	This(String name,int age,String hair_color){
		this(name,age);
		this.hair_color = hair_color;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Hair color :"+hair_color);
		System.out.println("\n");

		
	}
	

}
