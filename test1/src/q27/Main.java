package q27;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Car> carSet = new TreeSet<>();
		carSet.add(new Car(10123, "Volkswagen"));
		carSet.add(new Car(10124, "Audi"));
		System.out.println(carSet);
	}
}
