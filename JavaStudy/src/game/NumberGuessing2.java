package game;

public class NumberGuessing2 {
	
	/* 数当てゲーム2
	 * 「★数当てゲーム2★」と表示する
	 * int型で要素数3の配列numbersを用意する 初期値は3 4 8 とする
	 * 画面に「1桁の数字を入力してください」と表示する
	 * 入力された数字を変数inputに代入する
	 * 配列をループで回しながら、いずれかの要素と等しいかを調べる
	 * 一致していれば「アタリ」と表示する
	 * */

	public static void main(String[] args) {
		
		System.out.println("★数当てゲーム2★");
		
		int numbers[] = {3,4,8};
		
		System.out.println("1桁の数字を入力してください");
		
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int value: numbers) {
			
			if(value==input) {
				
				System.out.println("アタリ");
			
			}
		}

	}

}
