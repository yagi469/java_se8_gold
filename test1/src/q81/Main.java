package q81;

public class Main {

	public static void main(String[] args) {
		
		double taxRate = 0.0;
		String taxType = "SALES";
		
		switch (taxType) { // line n1
			case "LOCAL":
				taxRate = 8.0;
				break;
			case "INHABITANT":
				taxRate = 12.5;
				break;
			default:
				assert false : "N/A"; // line n2
		}
		
		System.out.println("Rate of tax:" + taxRate);
	}
}
