package instanceSample;

public class Brave {
	//フィールドを定義
	String name;//名前
	int hp;//ヒットポイント
	int op; //攻撃力
	
	public Brave (String name,int hp, int op) {
	this.name = name;
	this.hp = hp;
	this.op = op;
	}
	//--------------------動き（メソッド）定義-----------
	//攻撃するメソッド
	public void attack() {
		System.out.println(name + "の攻撃");
		System.out.println(name + "は" + op + "のダメージを与えた。");
	}
	//宿屋で回復するメソッド
	public void rest() {
		this.hp += 50;
		System.out.println(name + "は宿で休んだ");
		System.out.println(name + "は" + op + "のHPが50回復した。");
	}

}
