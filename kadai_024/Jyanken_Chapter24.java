package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	//自分の手を入力
	public String getMyChoice () {
		String myhand = "";
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		while ( i != 1) {
			System.out.println("自分のじゃんけんの手を入力しましょう\n"
					+ "グーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう");
			
			
			myhand = scanner.nextLine();
			
			switch (myhand) {
			case "r", "s", "p" -> i = 1;
			default -> System.out.println("エラー：入力が間違っています");
			}
		}
		
		scanner.close();
		return myhand;
		
	}
	
	//相手の手を取得
	public String getRandom () {
		String [] hands = {"r", "s", "p"};
		String rivals = hands[(int)Math.floor(Math.random() * 3)];
		return rivals;
	}
	
	//じゃんけんを行う
	public void playGame (String myhand, String rivals) {
		String result = "";
		HashMap<String, String> handsList = new HashMap<String, String>();
		
		handsList.put("r", "グー");
		handsList.put("s", "チョキ");
		handsList.put("p", "パー");
		
		System.out.println("自分の手は" + handsList.get(myhand) + ",対戦相手の手は" + handsList.get(rivals));
		
		//じゃんけんを実行
		if (myhand.equals(rivals)) {
			result = "drow";
		} else if(myhand.equals("r") && rivals.equals("s")) {
			result = "win";
		} else if(myhand.equals("r") && rivals.equals("p")) {
			result = "lose";
		} else if(myhand.equals("s") && rivals.equals("r")) {
			result = "lose";
		} else if(myhand.equals("s") && rivals.equals("p")) {
			result = "win";
		} else if(myhand.equals("p") && rivals.equals("r")) {
			result = "win";
		} else if(myhand.equals("p") && rivals.equals("s")) {
			result = "lose";
		} else {
			System.out.println("エラー");
		}
		
		//結果を表示
		if (result.equals("win")) {
			System.out.println("自分の勝ちです");
		} else if (result.equals("lose")) {
			System.out.println("自分の負けです");
		} else if (result.equals("drow")) {
			System.out.println("あいこです");
		} else {
			System.out.println("エラー");
		}
	}

}
