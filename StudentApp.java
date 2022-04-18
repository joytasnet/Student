import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		System.out.print("生徒は何人>");
		int id =new Scanner(System.in).nextInt();
		Student[] students = new Student[id];
		for(int i =0;i<students.length;i++){
			System.out.print((i+1)+"人目の名前>");
			String name =new Scanner(System.in).next();
			System.out.print((i+1)+"人目の点数>");
			int score =new Scanner(System.in).nextInt();
			Student s=new Student(i+1,name,score);
			students[i] =s;
		}
		while(true){
			System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
			int num =new Scanner(System.in).nextInt();
			if(num==1){
				for(int i=0;i<students.length;i++){
					for(int j =i+1;j<students.length;j++){
						if(students[i].id>students[j].id){
							Student temp=students[i];
							students[i]=students[j];
							students[j]=temp;
						}
					}
					students[i].showInfo();
				}
			}else if(num==2){
				for(int i =0;i<students.length;i++){
					for(int j =i+1;j<students.length;j++){
						if(students[i].score<students[j].score){
							Student temp=students[i];
							students[i]=students[j];
							students[j]=temp;
						}
					}
					students[i].showInfo();
				}

			}else{
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
