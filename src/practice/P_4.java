package practice;

public class P_4 {

	public static void main(String[] args) {
		// 文字列を数字に変換する命令
		String age = "23";
		int n = Integer.parseInt(age);
		System.out.println("来年私は" + (n + 1) + "歳です");
		
		// 乱数を生み出して代入
		// 乱数は実行する度に90未満の数字からランダムに決まる
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは" + r + "歳ですか？");

	}

}
