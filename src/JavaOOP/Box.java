package JavaOOP;

public class Box {
	double height,width,depth; // instance variable 
  Box(double hei,double wi,double de){ // here hei , wi , de are local variable
	  height = hei;
	  width = wi;
	  depth = de;
  }
  void displayvol() {
	  double result = height * width * depth;
	  System.out.println("Answer is : "+result);
	  System.out.println("\n");
  }


}
