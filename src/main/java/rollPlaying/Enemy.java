package rollPlaying;

public class Enemy{
private String name;
private int op;
private int dp;

public Enemy(String name,int op,int dp) {
	  this.name = name;
	  this.op = op;
	  this.dp = dp;
}
public Enemy getName() {
	return this ;
}
public int getOp() {
	return op;
}
public void setOp(int op) {
	this.op = op;
}
public int getDp() {
	return dp;
}
public void setDp(int dp) {
	this.dp = dp;
}
//public String setName(String name) {
	//this this.name = name;
//}

public void greeting() {
	  System.out.println(this.name + "が現れた！");
}
public void attack() {
	  System.out.println(this.name + "は" + this.dp + "のダメージを与えた！");
}
}




