package method.q09;

public class Even {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		checkEven(num1);
		checkEven(num2);
	}

	public static void checkEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}
}
