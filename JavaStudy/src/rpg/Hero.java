package rpg;

public class Hero {
	
	//属性
	
	private String name;
	//ゲッター
	public String getName() {
		return this.name;
	}
	
	//セッター
	//セッターの中で、値の妥当性を検査する
	public void setName(String name) {
		
		//名前の整合性チェック
		if(name == null) {
			throw new IllegalArgumentException("名前がnull、処理を中断");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる、処理を中断");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる、処理を中断");
		}
		
		this.name = name;
	}
	
	public int hp;
		public int getHp() {
			return this.hp;
		}
		
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	//操作
	
	void attack() {}

	
	//座る 座った秒数だけhpを回復する
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name+"は"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した！");
		System.out.println();
	}
	
	//転ぶ HPを5ポイント失う
	void slip() {
		this.hp -= 5;
		System.out.println(this.name+"は転んだ！");
		System.out.println("5のダメージ！");
		System.out.println();
	}
	
	//眠る HPが100に回復する
	void sleep(){
		this.hp = 100;
		System.out.println(this.name+"は、眠って回復した！");
		System.out.println();
		
		
	}
	
	//逃げる ゲームオーバー 残ったHPを表示する
	void run() {
		System.out.println(this.name+"は逃げ出した...");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+this.hp+"でした");
		System.out.println();
	}
	


}
