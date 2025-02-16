package rpg;
import java.util.Random;
public class Cleric {
	
	
	String name;			//名前
	int hp = 50;			//HP
	static final int MAX_HP = 50;	//最大HP
	int mp = 10;			//MP
	static final int MAX_MP = 10;	//最大MP
	
	//セルフエイド
	//MPを5消費して、自身のHPを最大HPまで回復する。
	public void selfaid() {
		
		System.out.println(this.name+"はセルフエイドを唱えた！");
		
		this.mp -= 5;
		this.hp = Cleric.MAX_HP;
		
		System.out.println("HPが最大値まで回復した！");
		System.out.println();
	}
	
	//祈る
	//自身のMPを回復する。回復量は「祈った秒数 + 0~2ポイントの補正値」
	//最大MPより多く回復しない
	public int play(int playTime) {
		
		System.out.println(this.name+"は"+playTime+"秒祈った！");
		
		//回復量を求める
		int recover = new Random().nextInt(3) + playTime;
		
		//回復量が最大MPを超えないようにする
		//「現在のMPと最大MPの差」「回復量」の小さい方を採用する
		int recoverActual = Math.min(Cleric.MAX_MP - this.mp, recover);
		
		this.mp += recoverActual;
		
		System.out.println("MPが"+recoverActual+"ポイント回復した！");
		System.out.println("【MP:"+this.mp+"/"+Cleric.MAX_MP+"】");
		System.out.println();
		return recoverActual;
		
	}
	
	/*
	 *  コンストラクタの実装テスト。以下5つの条件を満たすようにする
	 * 1. new Cleric("レナ", 40, 5) のように、名前、HP、MPを指定してインスタンス化できる
	 * 2. new Cleric("レナ", 40) のように、名前とHPだけでインスタンス化できる。その際、MPは最大MPの値で初期化される
	 * 3. new Cleric("レナ")のように、名前だけでインスタンス化できる。その際、HPは最大HPの値で、MPは最大MPの値で初期化される
	 * 4. new Cleric()のように、名前なしの場合はインスタンス化できないものとする
	 * 5. コンストラクタは極力重複コードを無くすよう記載する
	 */
	
	//コンストラクタ1
	Cleric(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	//コンストラクタ2
	Cleric(String name, int hp){
		
		//コンストラクタ1を呼び出してる
		this(name, hp, Cleric.MAX_MP);
	}
	
	//コンストラクタ3
	Cleric(String name){
		
		//コンストラクタ2を呼び出してる
		this(name, Cleric.MAX_HP);
		
		//this(name, Cleric.MAX_HP, Cleric.MAX_MP);でも動く
		//この場合、コンストラクタ1を呼び出してる
	}
	
}
