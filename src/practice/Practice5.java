package practice;

public class Practice5 {

	public static void main(String[] args) {
		// キーボードから文字列の入力を受け付ける
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("ようこそ" + name + "さん");
		// キーボードから数字の入力を受け取る
		System.out.println("年齢を教えてください");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println(age + "歳ですね");

	}

}
