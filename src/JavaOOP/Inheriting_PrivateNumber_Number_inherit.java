package JavaOOP;

public class Inheriting_PrivateNumber_Number_inherit extends Inheriting_PrivateNumber_Number {
		private String University_Name;
		
		public void set_uni(String Uni_name) {
			University_Name = Uni_name;
		}
		public  String get_uni() {
			return University_Name;
		}
void pringing_display() {
			
			System.out.println("Your name "+get_info());
			System.out.println("Your Age : "+get_age());
			System.out.println("University Name : "+get_uni());

		}
		
		
		
}
