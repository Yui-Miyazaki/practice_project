package practice;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		String name = "宮崎由衣";
		name = "宮崎";
		System .out.println (name);
		int num = 2030;
		System.out.println(num);
		double num2 = 3.2;
		System.out.println(num2);
		int [] aray = new int [5];
		
		aray [0] = 60;
		aray [1] = 90;
		aray [2] = 85;
		aray [3] = 70;
		aray [4] = 55;
		
		System.out.println(aray[0]);
		System.out.println(aray[1]);
		System.out.println(aray[2]);
		System.out.println(aray[3]);
		System.out.println(aray[4]);
		
		int[][] intArray = {{1,2,3},{4,5,6}};
		 
		System.out.println(intArray[0][0]);
		System.out.println(intArray[1][0]);
		
		List<String> sampleList = new ArrayList<>();
		sampleList.add("角谷");
		sampleList.add("中川");
		sampleList.add("森");
		sampleList.add("宮崎");
		
		System.out.println(sampleList.get(2));
		System.out.println(sampleList.size());
		System.out.println(sampleList.isEmpty());
		
		String[] strArray = {"A","B","C","D","E","F","G","H","I"};
		for(String str:strArray) {
			System.out.println(str);
		}
	}
		
			
		
	 //修飾子　戻り値の型　メソッド名（）引数の型　仮引数名）
	public static void selfIntroduce(String name) {
		        System.out.println ("私の名前は" + name + "です。");        
	}
	
}
