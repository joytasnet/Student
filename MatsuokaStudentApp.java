import java.util.*;
public class MatsuokaStudentApp{
	public static void main(String[] args){
		System.out.print("生徒は何人>");
		Scanner scan=new Scanner(System.in);
		int student_Num=scan.nextInt();
		Student students[]=new Student[student_Num];
		Student default_students[]=new Student[student_Num];
		for(int i=0;i<students.length;i++){
			System.out.printf("%d人目の名前>",i+1);
			String name=scan.next();
			System.out.printf("%d人目の点数>",i+1);
			int score=scan.nextInt();
			Student s=new Student(i+1,name,score);
			students[i]=s;
			default_students[i]=s;
		}
		while(true){
			System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
			int operation=scan.nextInt();
			if(operation==2){
				for(int i=0;i<students.length-1;i++){
					for(int j=1;j<students.length;j++){
						if(students[i].score<students[j].score){
							Student[] tmp=new Student[1];
							tmp[0]=students[i];
							students[i]=students[j];
							students[j]=tmp[0];
						}
					}
				}
				for(int i=0;i<students.length;i++){
					students[i].showInfo();
				}
			}
			if(operation==1){
				for(int i=0;i<students.length;i++){
					default_students[i].showInfo();
				}
			}
			if(operation==3){
				break;
			}
		}
	}
}
