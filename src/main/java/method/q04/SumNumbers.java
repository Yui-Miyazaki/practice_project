package method.q04;

public class SumNumbers {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 2;
		int totalNum = calculateSum(num1, num2);
		System.out.println("第一引数" + " : " + num1);
		System.out.println("第二引数" + " : " + num2);
		System.out.println("第三引数" + " : " + totalNum);
	}

	public static int calculateSum(int num1, int num2) {
		int totalNum = num1 + num2;
		return totalNum;
	}

}
