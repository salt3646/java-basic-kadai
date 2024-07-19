package kadai_014;

public class Car_Chapter14 {

	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	//ギアチェンジ用のメソッドを作成
	public void gearChange (int afterGear) {
		switch(afterGear) {
			case 1 -> speed = 10;
			case 2 -> speed = 20;
			case 3 -> speed = 30;
			case 4 -> speed = 40;
			case 5 -> speed = 50;
			default -> speed = 10;
		}
		System.out.println("ギアを" + gear + "から" + afterGear + "に切り替えました");
		gear = afterGear;
	}
	
	//速度表示用のメソッドを作成
	public void run () {
		System.out.println("速度は時速" + speed + "kmです");	
	}

}
