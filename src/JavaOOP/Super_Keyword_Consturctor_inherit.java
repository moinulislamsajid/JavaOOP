package JavaOOP;

public class Super_Keyword_Consturctor_inherit extends Super_Keyword_Consturctor {
	int price;
	Super_Keyword_Consturctor_inherit(String name,double weight,int price){
		super(name,weight); // calling the constructor of super_keyword_Consturctor
		this.price = price;
	}
		@Override
		void display() {
			super.display(); // super keyword most important
			System.out.println("Price : "+price);
			
		}
	}
	
	

