package q08;

public class Main {

	public static void main(String[] args) {

		Foo x = new Foo();
		x.setId(1);
		Foo y = x;

		if (x.equals(y)) { // trueの場合
			// trueであればOK、falseの場合にはNG
			System.out.println(x.hashCode() == y.hashCode());
		}
		
		y = new Foo();
		y.setId(2);
		if (!x.equals(y)) { // trueの場合
			// falseが望ましいが、trueでもOK
			System.out.println(x.hashCode() == y.hashCode());
		}
	}
}
