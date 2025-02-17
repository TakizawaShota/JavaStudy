package rpg;

//Matangoクラスを継承したクラス
public class PoisnMatango extends Matango{
	private int poisnAttackCount = 5; //毒の残り攻撃回数

	public PoisnMatango(char suffix) {
		super(suffix);
	}
	
	//attackの仕様
	//1 まず親クラスのattackの処理を行う
	//2 毒攻撃の残り回数が0以上なら、以下を追加で行う
	//3 画面に「さらに毒の胞子をばらまいた！」と表示する
	//4 勇者のHPの1/5に相当するポイントを勇者のHPから引き、
	//  そのポイントを示す「~ポイントのダメージ！」と表示する
	//5 毒の残り攻撃回数を1減らす
	public void attack(Hero h) {
		super.attack(h);
		if(this.poisnAttackCount > 0 ) {
			System.out.println("毒の胞子をばらまいた！");
			
			int dmg = h.getHp() / 5;
			h.setHp(h.getHp() - dmg);
			System.out.println(dmg+"ポイントのダメージ！");
			
			this.poisnAttackCount--;
		}
		
	}

}
