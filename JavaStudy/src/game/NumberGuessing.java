package game;

/* 0~9の数字の中からランダムな数字を当てるゲーム
 * 
 * 1. 画面に「★数当てゲーム★」と表示する
 * 2. 0から9までのうちランダムな数字をひとつ生成して、変数ansに代入する
 * 3. for文を用いた5回繰り返すループを作る。その際、以下の4~7はループ中に記述する
 * 4. 画面に「0~9の数字を入力してください」と表示する
 * 5. 数字を入力し、変数numに代入する
 * 6. もし変数numがansと等しい場合「アタリ!」と表示して繰り返しを終了する
 * 7. もし変数numがansと等しくない場合、「違います」と表示する
 * 8. 繰り返しブロックの外側で「正解はansです」「ゲームを終了します」と画面に表示する
 * 
 * */

public class NumberGuessing {

	public static void main(String[] args) {
		
		System.out.println("★数当てゲーム★");
		
		int ans = new java.util.Random().nextInt(10);
		

		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			
			int num = new java.util.Scanner(System.in).nextInt();
			
			if(num == ans) {
				
				System.out.println("アタリ!");
				break;
				
			}else {
				System.out.println("違います");
			}
			
		}
		System.out.println("正解は"+ans+"です");
		System.out.println("ゲームを終了します");
	}

}
