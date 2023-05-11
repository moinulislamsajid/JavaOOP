package JavaOOP;

public class Forparameter {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object
		player player1 = new player("Ayman Sajid\n","Male\n",17);  // for constructor initialization object 
		
		
		
		//player1.player_information("Ayman Sajid\n","Male\n",17);
		player1.information_print();
		
		
		player player2 = new player("Samiur Rahman Sakib\n","Male\n",10); // // for constructor initialization object
		
		//player1.player_information("Samiur Rahman Sakib\n","Male\n",10);
		player2.information_print();
		
		player player3 = new player();
		player3.information_print();

		
		
	}

}
