package q08;

public class Foo {
	
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.getClass() == obj.getClass()) {
			Foo other = (Foo)obj;
			if (this.id == other.id) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
//		return 1; // hashCodeメソッドの実装要件を満たす、常に1を返すコード
		return this.id;
	}
}