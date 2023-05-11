package JavaOOP;

public class Polymorphism2_inheriet extends Polymorphism2 {

	double length,width;
	Polymorphism2_inheriet(double length,double width){
		this.length = length;
		this.width  =   width; 
	}
	@Override
	double area() {
		return length*width;
	}
}
