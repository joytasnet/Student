public class Student{
	int id;
	String name;
	int score;

	public Student(int id,String name,int score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
	public void showInfo(){
		System.out.printf("%s(id:%d)...%d点%n",this.name,this.id,this.score);
	}
}
