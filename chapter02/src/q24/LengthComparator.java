package q24;

import java.util.Comparator;

class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length(); // 文字列の長さによる並べ替え順の制御
	}
}