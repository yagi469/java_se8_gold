package q12;

public class Example {

	public void x() {

		try {
			doIt(1);
//		} catch (ArithmeticException | NumberFormatException | Exception e) { // line n1
		
		// A.
//		} catch (Exception | ArithmeticException | NumberFormatException e) {	
		
		// B.
		} catch (ArithmeticException | NumberFormatException e) {
			
			System.out.println(e.getMessage()); // line n2
			
		// C.
//			throw e;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void doIt(int value) throws ArithmeticException, NumberFormatException, Exception {
		if (value < 1) {
			throw new Exception("Invalid value");
		}
	}
}
