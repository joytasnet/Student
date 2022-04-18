public class Student{
	int id;
	String name;
	int score;
	public Student(int id,String name,int score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
	public void show(){
		System.out.printf("%s(id:%d)...%d点%n",name,id,score);
	}
}
