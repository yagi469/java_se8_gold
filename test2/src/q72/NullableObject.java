package q72;

import java.util.Optional;

public class NullableObject {
	
	private Optional<String> str;

	public NullableObject(Optional<String> str) {
		this.str = str;
	}

	public Optional<String> getStr() {
		return str;
	}
}