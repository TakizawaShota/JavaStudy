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
		System.out.println();
		
		//聖職者の生成
		Cleric c1 = new Cleric("レナ", 30,7);
		Cleric c2 = new Cleric("モカ", 25);
		Cleric c3 = new Cleric("ミカ");
		
		System.out.println("コンストラクタ呼び出しテスト------------");
		
		System.out.println(c1.name+"/"+c1.hp+"/"+c1.mp);
		System.out.println(c2.name+"/"+c2.hp+"/"+c2.mp);
		System.out.println(c3.name+"/"+c3.hp+"/"+c3.mp);
		
		System.out.println("-----------------------------------------");
//		c.name = "レナ";
//		c.hp = 50;
//		c.mp = 10;
		
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
		
		//聖職者の行動
//		c.selfaid();
//		c.play(150);
		//敵の行動
	}

}
