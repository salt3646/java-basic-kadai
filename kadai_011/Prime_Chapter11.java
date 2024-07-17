package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		//boolean型の配列を宣言
		boolean[] judge = new boolean[101];
		
		//配列を初期化
		for (int i=2; i<101; i++ ) {
			judge[i] = true;
		}
		
		//素数を判定する
		for (int i=1; i<101; i++ ) {
			for (int j=2; i>j; j++ ) {
				if ( i%j == 0) {
					judge[i] = false;
				}
			}
		}
		
		//素数を表示する
		for (int i=1; i<101; i++) {
			if (judge[i] == true) {
				System.out.println(i);
			}
		}	
	}

}
