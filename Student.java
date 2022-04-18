import java.util.*;
public class Student{
	/*フィールド変数*/
	int id;
	String name;
	int score;
	/*コンストラクタ*/
	Student(int id, String name, int score){
		this.id = id;
		this.name = name;
		this.score = score;
	}
	/*メソッド*/
	public void showInfo(){
		System.out.printf("%s(id:%s)...%d点%n",name,id,score);
	}
}
