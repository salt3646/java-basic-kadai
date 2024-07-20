package kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		
		//人ごとにインスタンス化
		KatoTaro_Chapter17 Taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 Hanako = new KatoHanako_Chapter17();
		
		//下の名前をセット
		Taro.setGivenName();
		Ichiro.setGivenName();
		Hanako.setGivenName();
		
		//紹介を実行
		Taro.execIntroduce();
		Ichiro.execIntroduce();
		Hanako.execIntroduce();
	}
}