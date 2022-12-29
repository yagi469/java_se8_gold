package q39;

public class Main {

	public static void main(String[] args) {
		
		// A. 
//		Airplane a = Airplane("Boeing")::new;
		
		// B. 
//		Airplane a = Airplane::new;
//		Airplane a = auto::getAirplane("Boeing");
		
		// C. 
		Flyable f = Airplane::new;
		Airplane a = f.getAirplane("Boeing");
		
		// D. 
//		Airplane a = Flyable::new::getAirplane("Boeing");
	}
}
