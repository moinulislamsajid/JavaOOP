package JavaOOP;

public class Encapsulation {
	private String  name;
	private int age;
	
	public void set_information(String name) {
		this.name = name;
	}
	public String get_information() {
		return name;
	}
	public void set_info(int age) {
		this.age = age;
	}
	
	public int get_info() {
		return age;
	}
	

}
