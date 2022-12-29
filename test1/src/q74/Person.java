package q74;

import java.util.Optional;

public class Person {

	Optional<Mobile> mobile;

	public void setMobile(Optional<Mobile> mobile) {
		this.mobile = mobile;
	}

	public Optional<Mobile> getMobile() {
		return mobile;
	}
}