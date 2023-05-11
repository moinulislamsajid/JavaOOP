package JavaOOP;

public class Polymorphism_inherit2 extends Polymorphism2 {

	double base,height;
	Polymorphism_inherit2(double base,double height){
		this.base = base;
		this.height = height;
	}
	@Override
	double area() {
		return 0.5*base*height;
		
	}
}
