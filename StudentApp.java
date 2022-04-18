import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("生徒は何人>");
		int num = scan.nextInt(); 
		Student[] students = new Student[num];
		int id_num = 1;
		for(int i=0;i<students.length;i++){
			System.out.printf("%d人目の名前>",id_num);
			String name = scan.next();
			System.out.printf("%d人目の点数>",id_num);
			int point = scan.nextInt();
			Student student=new Student(id_num,name,point);
			students[id_num-1]=student;
			id_num++;
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
		Student[] disposable = new Student[1];
		for(int i=0;i<students.length;i++){
			for(int j=1+i;j<students.length;j++){
				if(input ==1){
					if(students[i].id > students[j].id){
						disposable[0] = students[i];
						students[i] = students[j];
						students[j] = disposable[0];
					}
				}else{
					if(students[i].score < students[j].score){
						disposable[0] = students[i];
						students[i] = students[j];
						students[j] = disposable[0];
					}
				}
			}
			students[i].showInfo();
		}
	}
}
