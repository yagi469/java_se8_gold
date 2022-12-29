package q74;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		Mobile mobile = null;
		Optional<Mobile> m = Optional.ofNullable(mobile);
		Person person = new Person();
		person.setMobile(m);
		String mNumber = person.getMobile()
			.isPresent() ? m.get().getNumber() : "Mobile not available";
		System.out.println(mNumber);
	}
}
