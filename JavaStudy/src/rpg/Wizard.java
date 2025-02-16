package rpg;

//魔法使いのクラス
public class Wizard {
	
	private int hp;
	public int getHp() {return this.hp;}
	
	//hpは0以上であり、負の値が設定されようとすると0を設定する
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		}
		else{
			this.hp = hp;
		}
	}
	
	private int mp;
	public int getMp() {return this.mp;}
	//mpの値は0以上
	
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("魔法使いのMPは0以上です");
		}
		this.mp = mp;
	}
	
	private String name;
	public String getName() {return this.name;}
	
	//名前の設定値はnullでない かつ 3文字以上
	public void setName(String name) {
		if(name == null || name.length() <= 3){
			throw new IllegalArgumentException("名前の設定値が異常です");
		}
		this.name = name;
	}
	
	private Wand wand;
	public Wand getWand() {return this.wand;}
	//魔法使いの杖はnullであってはならない
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("杖を設定してください");
		}
		this.wand = wand;
	}
	
	//勇者のhpを回復させる
	void heal(Hero h) {
		int basePoint = 10; //基礎回復ポイント
		int recoverPoint = (int)(basePoint + this.getWand().getPower());
		
		h.setHp(h.getHp()+recoverPoint);
		System.out.println(this.getName()+"はヒールを唱えた！");
		System.out.println(h.getName()+"のHPを"+recoverPoint+"回復した！");
	}

}
