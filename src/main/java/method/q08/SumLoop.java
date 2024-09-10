package method.q08;

public class SumLoop {
	public static void main(String[] args) {
		int num1 = 1;
		double num2 = 100;
		int totalNum = sumLoop(num1, num2);
		System.out.println("最小値" + " : " + num1);
		System.out.println("最大値" + " : " + (int)num2);
		System.out.println("加算結果" + " : " + totalNum);
	}

	public static int sumLoop(int num1, double num2) {
		int maxNum2 = (int) num2;
		int sum = 0;
		for (int i = num1; i <= maxNum2; i++) {
			sum += i;
		}
		return sum;
	}

}
