package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {

	//下の名前を入力するメソッド
	public void setGivenName() {
		givenName = "太郎";
	}
	
	//個別の紹介を出力する抽象メソッドの子
	public void eachIntroduce() {
		System.out.println("Javaが得意です\n");
	}

}
