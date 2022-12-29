package q32;

public class Sales {

	int id;
	int qty;

	public Sales(int id, int qty) {
		this.id = id;
		this.qty = qty;
	}

	public String toString() {
		// 紙面の誤植から修正済み
		return "Sales[id:" + id + ", qty" + qty + "]";
	}
}