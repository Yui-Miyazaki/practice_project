package instanceSample;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	
	Brave brave = new Brave("勇者",100,20);//インスタンス生成
	brave.name = "勇者";
	brave.hp = 100;
	brave.op = 20;
	
	Brave warrior = new Brave("戦士",90,15);
	warrior.name = "戦士";
	warrior.hp = 90;
	warrior.op = 15;
	
	System.out.println("------------------------------");
	System.out.println(brave.name + "" + warrior.name);
	System.out.println("HP" + brave.hp + "HP" + warrior.hp);
	System.out.println("------------------------------");
	
	brave.attack();
	warrior.rest();
	
	System.out.println("------------------------------");
	System.out.println(brave.name + "" + warrior.name);
	System.out.println("HP" + brave.hp + "HP" + warrior.hp);
	System.out.println("------------------------------");
	
	}
	
	


}
