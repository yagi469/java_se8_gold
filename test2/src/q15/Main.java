package q15;

public class Main {

	public static void main(String[] args) {
		
		try (ResourceA a = new ResourceA();
			 ResourceB b = new ResourceB()) {
			System.out.print("M");
		}
	}
}
