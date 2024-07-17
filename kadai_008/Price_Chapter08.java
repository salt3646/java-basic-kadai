package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		//変数を宣言、初期化
		int userAge = 0;
		int serviceCost = 0;
		
		//年齢30代を変数に代入
		userAge = 30;
		
		//料金の条件分岐
		serviceCost = switch(userAge) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30 -> 3000;
			case 40 -> 3000;
			case 50 -> 4000;
			case 60 -> 4000;
			case 70 -> 4000;
			case 80 -> 5000;
			default -> 500;
		};
		
		//料金を表示
		System.out.println(userAge + "代の料金は" + serviceCost + "円です");

	}

}
