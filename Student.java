public class Student{
	String name;
	int id;
	int score;

	public Student(int id,String name,int score){
		this.name=name;
		this.id=id;
		this.score=score;
	}
	public void showInfo(){
		System.out.printf("%s(id:%d)...%d点%n",this.name,this.id,this.score);
	}
}
