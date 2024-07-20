package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	//下の名前を入力するメソッド
	public void setGivenName() {
		givenName = "一郎";
	}
	
	//個別の紹介を出力する抽象メソッドの子
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです\n");
	}

}
