package rpg;

public class Matango {
	
	//属性
	int hp = 50;
	private char suffix;
	
	public Matango( char suffix) {this.suffix = suffix;}
	final int LEVEL = 10;
	
	public void  attack(Hero h) {
		System.out.println("きのこ"+this.suffix+"の攻撃！");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}

	void run() {
		System.out.println("おばけキノコ"+suffix+"は逃げ出した！");
	}
	
	

}
