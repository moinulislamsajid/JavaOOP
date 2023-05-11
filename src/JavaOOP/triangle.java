package JavaOOP;

public class triangle extends Problem1 {
	
	triangle(double dim1,double dim2){
		super(dim1,dim2);
	}
	@SuppressWarnings("unused")
	@Override
	void shape() {
	double result = 0.5 * dim1 * dim2;
	System.out.println("Area of Rectangle : "+result);
	}

}
