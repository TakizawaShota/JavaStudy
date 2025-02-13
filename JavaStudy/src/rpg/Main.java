package rpg;


	/* オブジェクト指向復習
	 * 
	 * 勇者、敵をそれぞれオブジェクトで定義し
	 * メインメソッド内で処理する
	 * 
	 * */
public class Main {

	public static void main(String[] args) {
		
		//勇者の生成
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者"+h.name+"を生み出した！");
		
		//敵の生成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 50;
		m2.suffix = 'B';
		
		
		//勇者の行動
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		//敵の行動
	}

}
