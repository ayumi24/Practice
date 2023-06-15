package practice;

public class Practice {
	public static void main(String[] args) {
	// 複数の引数を定義して代入する
	printData("Kate Jones", 25);
	printData("Bob", 30);
  }
	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}
}
