package q02;

public class Example {
	public void doIt() throws Exception {
		try {
			// NumberFormatExceptionがスローされる可能性のあるコード
		} catch (NumberFormatException e) {
			// insert code here
//			throw e.addException(new Exception());
//			throw e.chain(new Exception());
			throw new Exception(e);
//			throw new Exception().add(e);
		}
	}
}