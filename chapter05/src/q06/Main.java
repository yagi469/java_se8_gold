package q06;

public class Main {

	void doSomething() {
		try {
			doIt(-1);
		} catch (MyException e) {
			// 例外処理
		}
	}

	void doIt(int value) throws MyException {
		if (value < 0) {
			throw new MyException();
		}
	}
}
