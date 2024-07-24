package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		//自分の手を入力
		String myhand = jyanken.getMyChoice();
		
		//相手の手を取得
		String rivals = jyanken.getRandom();
		
		//じゃんけんを実行
		jyanken.playGame(myhand, rivals);
	}

}
