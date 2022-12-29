package q25;

public enum Size {
	
//	S, M, L;
	S(1), M(5), L(10); // 引数を取るコンストラクタ呼び出しが必要
	private int value;

//	public Size(int value) {
	private Size(int value) { // アクセス修飾子はprivateのみOK
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
