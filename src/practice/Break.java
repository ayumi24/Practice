package practice;

public class Break {

	public static void main(String[] args) {
		// break文を書かないコード
		System.out.println("あなたの運勢を占います");
		// 1から5までの乱数を発生
		int fotune = new java.util.Random().nextInt(5) + 1;
		switch (fotune) {
		case 1:
		case 2:
			System.out.println("いいね！");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
		case 5:
			System.out.println("うーん・・・");
		}

	}

}
