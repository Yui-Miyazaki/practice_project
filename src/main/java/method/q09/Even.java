package method.q09;

public class Even {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		checkEven(num1);
		checkEven(num2);

	}

	public static void checkEven(int num) {
		if (isEvenNumber(num)) {
			System.out.println(num + "は偶数です。//引数が" + num + "の場合");
		} else {
			System.out.println(num + "は奇数です。//引数が" + num + "の場合");
		}
	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}

}
