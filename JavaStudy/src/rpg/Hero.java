package rpg;

public class Hero {
	
	//属性
	
	String name;
	int hp;
	
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
