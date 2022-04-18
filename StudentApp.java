import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		//スキャナー用意
		Scanner scan = new Scanner(System.in);
		//生徒が何人か決める
		System.out.print("生徒は何人>");
		int num = scan.nextInt();
		Student[] students = new Student[num];
		//生徒の名前と点数を決める
		for(int i=0;i<num;i++){
			String name = "";
			int score = 0;
			//名前
			System.out.printf("%d人目の名前>",i+1);
			name = scan.next();
			//点数
			System.out.printf("%d人目の点数>",i+1);
			score = scan.nextInt();
			students[i] = new Student(i+1,name,score);
		}
		//操作入力
		int menu = 0;
		while(true){
			System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
			menu = scan.nextInt();
			//操作選択
			switch(menu){
				case 1:
					sort(students,menu);
					break;
				case 2:
					sort(students,menu);
					break;
				case 3:
					System.out.println("アプリケーションを終了します");
					return;
				default:
					System.out.println("その選択肢は用意してません");
			}
			//表示
			if(menu == 1 || menu == 2){
				for(int i=0;i<students.length;i++){
					students[i].showInfo();
				}
			}
		}
	}
	//ソート順
	public static void sort(Student[] students,int menu){
		for(int i=0;i<students.length-1;i++){
			for(int j=i+1;j<students.length;j++){
				switch(menu){
					case 1:
						if(students[i].id > students[j].id){
							Student temp = students[i];
							students[i] = students[j];
							students[j] = temp;
						}
						break;
					case 2:
						if(students[i].score > students[j].score){
							Student temp = students[i];
							students[i] = students[j];
							students[j] = temp;
						}
						break;
				}
			}
		}
	}
}
