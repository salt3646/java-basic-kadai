package kadai_017;

abstract public class Kato_Chapter17 {
	//フィールド
	//下の名前は子クラスで入力する
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	//名前と住所を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介を出力する抽象メソッド(親)
	abstract public void eachIntroduce();
	
	//上記2つのメソッドを実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
