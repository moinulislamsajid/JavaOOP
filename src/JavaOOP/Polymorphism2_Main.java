package JavaOOP;

public class Polymorphism2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism2[] s = new Polymorphism2[3];

		s[0] = new Polymorphism2();
		s[1] = new Polymorphism2_inheriet(10,20);
		s[2] = new Polymorphism_inherit2(40,50);
		
		
		for(int i =0 ; i<3;i++) {
		System.out.println(s[i].area());
		}
		
		
		
		

		
	}

}
