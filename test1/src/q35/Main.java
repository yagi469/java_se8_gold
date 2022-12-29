package q35;

public class Main {

	public static void main(String[] args) {
		
		System.out.print(Directions.EAST.ordinal() == Cards.HEART.ordinal());
		System.out.print(Directions.EAST.equals(Cards.HEART));
	}
}
