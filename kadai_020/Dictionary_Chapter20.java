package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public Dictionary_Chapter20 () {
	dictionary.put("apple", "りんご");
	dictionary.put("peach", "桃");
	dictionary.put("banana", "バナナ");
	dictionary.put("lemon", "レモン");
	dictionary.put("pear", "梨");
	dictionary.put("kiwi", "キウィ");
	dictionary.put("strawberry", "いちご");
	dictionary.put("grape", "ぶどう");
	dictionary.put("muscat", "マスカット");
	dictionary.put("chery", "さくらんぼ");
	}
	
	public void check(String[] keyword) {
		for (int i=0; i<keyword.length; i++) {
			String answer = dictionary.get(keyword[i]);
			
			if (answer == null) {
				System.out.println(keyword[i] + "は辞書に存在しません");
			} else {
				System.out.println(keyword[i] + "の意味は" + answer);
			}
		}
			
	}
	
	

}
