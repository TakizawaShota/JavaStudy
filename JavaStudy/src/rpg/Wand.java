package rpg;

//魔法使いが持つ杖の情報を管理するクラス
public class Wand {
	private String name;
	
	public String getName() {return this.name;}
	//名前の設定値はnullでない かつ 3文字以上
	public void setName(String name) {
		if(name == null || name.length() <= 3){
			throw new IllegalArgumentException("名前の設定値が異常です");
		}
		this.name = name;
	}
	
	private double power;
	public double getPower() {return this.power;}
	
	//魔力の増減幅は0.5以上かつ100.0以下である
	public void setPower(double power) {
		if(power < 0.5 || power > 100 ) {
			throw new IllegalArgumentException("魔力の増減幅が異常です");
		}
		this.power = power;
	}
}
