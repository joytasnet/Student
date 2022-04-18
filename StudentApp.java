import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("生徒は何人>");
		int num = scan.nextInt(); 
		Student[] students = new Student[num];
		for(int i=0;i<students.length;i++){
			System.out.printf("%d人目の名前>",i+1);
			String name = scan.next();
			System.out.printf("%d人目の点数>",i+1);
			int point = scan.nextInt();
			Student student=new Student(i+1,name,point);
			students[i]=student;
		}
		int input = 0;
		do{
			System.out.print("操作を入力:1…登録順に一覧,2…点数降順に一覧…,3…終了>");
			input = scan.nextInt();
			rearranging(students,input);
		}while(input !=3);
		System.out.println("アプリケーションを終了します");
	}
	static void rearranging(Student[] students,int input){
		for(int i=0;i<students.length;i++){
			for(int j=1+i;j<students.length;j++){
				if(input ==1){
					if(students[i].id > students[j].id){
						Student temp = students[i];
						students[i] = students[j];
						students[j] = temp;
					}
				}else{
					if(students[i].score < students[j].score){
						Student temp = students[i];
						students[i] = students[j];
						students[j] = temp;
					}
				}
			}
			students[i].showInfo();
		}
	}
}
