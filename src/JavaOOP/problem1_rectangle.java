package JavaOOP;

public class problem1_rectangle extends Problem1 {
	
	problem1_rectangle(double dim1,double dim2){
		super(dim1,dim2);
	}
	@SuppressWarnings("unused")
	@Override
	void shape() {
	double result = dim1 * dim2;
	System.out.println("Area of Rectangle : "+result);
	}
	

}
