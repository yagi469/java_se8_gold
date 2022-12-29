package q12;

import java.util.ResourceBundle;

/**
 * resourcesフォルダ内に、必要となるリソース･バンドル用のプロパティ・ファイルとクラス用のソース・ファイルが配置されています。
 * あるファイルが存在しない場合の検索順序を確認するためには、使用されているファイルを「temp」フォルダに移動して実行してください。
 */
public class Main {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("MyResources");
		System.out.println(rb.getString("resource"));
	}
}
