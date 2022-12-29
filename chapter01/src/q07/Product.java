package q07;

public class Product {

	private int id;
	private String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj != null && this.getClass() == obj.getClass()) {
//			Product other = (Product) obj;
//			return (this.id == other.id) && (this.name.equals(other.name));
//		}
//		return false;
//	}
}