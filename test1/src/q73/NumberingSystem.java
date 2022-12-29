package q73;

public enum NumberingSystem {

	BINARY(2), OCTAL(8), DECIMAL(10), HEX(16);

	int value;

	NumberingSystem(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}
}