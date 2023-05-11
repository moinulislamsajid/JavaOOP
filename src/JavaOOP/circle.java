package JavaOOP;

public class circle extends Problem1{

	circle(double r){
		super(r,r);
	}
		@Override
		void shape() {
			double result = 3.1416 * dim1 * dim1;
			System.out.println("Circle : "+result);
		}
	}


