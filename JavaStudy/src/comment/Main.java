package comment;

/* 同パッケージ内の他クラスファイルからメソッドを呼び出すテスト
 * クラス名の指定方法も２通りで実装
 * 
 * 某時代劇のようなワンシーンを再現しており、
 * 
 * 　黄金色の菓子でござる。
 * →この老いぼれの目はごまかせませんぞ
 * →ええい。こしゃくな！であえい！
 * →もういいでしょう
 * →この紋所が目にはいらぬか！
 * →この老いぼれの目はごまかせませんぞ
 * とセリフ表示を、それぞれ前半(Zenhan)後半(Kouhan)に分けて実装。
 * */

public class Main {

	public static void main(String[] args)throws Exception {
	
		Zenhan.doWarusa();
		Zenhan.doTogame();
		
		comment.Kouhan.callDeae();
		comment.Kouhan.showMondokoro();
		

	}

}
