import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("生徒は何人>");
		int num = scan.nextInt();
		Student[] students = new Student[num];
		for(int i=0;i<num;i++){
			System.out.printf("%d人目の名前>",i+1);
			String name = scan.next();
			System.out.printf("%d人目の点数>",i+1);
			int score = scan.nextInt();
			students[i]= new Student(i+1,name,score);
		}
		while(true){
			System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
			int ans = scan.nextInt();
			switch(ans){
				case 1:
					for(int i=0 ;i<students.length;i++){
						for(int j=i+1;j<students.length;j++){
							if(students[i].id<students[j].id){
								Student temp = students[i];
								students[i] = students[j];
								students[j] = temp;
							}
						}
						students[i].showInfo();
					}
					break;
				case 2:
					for(int i=0 ;i<students.length;i++){
						for(int j=i+1;j<students.length;j++){
							if(students[i].score<students[j].score){
								Student temp = students[i];
								students[i] = students[j];
								students[j] = temp;
							}
						}
						students[i].showInfo();
					}
					break;
				case 3:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
