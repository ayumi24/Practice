package practice;

public class Fortune {

	public static void main(String[] args) {
		//  占いプログラム
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		// 自分の名前を入力
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		// 年齢を入力
		String ageString = new java.util.Scanner(System.in).nextLine();
		// 文字列を数値に変換
		int age = Integer.parseInt(ageString);
		// 0から3までの乱数を生成
		int fortune = new java.util.Random().nextInt(4);
		// インクリメントで1増やして0から4までにする
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、" + "あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");

	}

}
