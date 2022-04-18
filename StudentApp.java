import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("生徒は何人ですか？>>");
		int studentnum = scan.nextInt();
		Student[] students = new Student[studentnum];

		for(int i=0 ; i<students.length ; i++){
			System.out.printf("%d人目の名前>>",i+1);
			String name = scan.next();
			System.out.printf("%d人目の点数>>",i+1);
			int score = scan.nextInt();
			int id = i+1;
			Student studentI = new Student(id,name,score);
			students[i] = studentI;
		}

		while(true){
			System.out.println("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
			int select = scan.nextInt();
			switch(select){
				case 1 :
					sortID(students);
					for(Student s : students){
						s.showInfo();
					}
				break;
				case 2 :
					sortScoreDown(students);
					for(Student s : students){
						s.showInfo();
					}
				break;
				case 3 :
					System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
	static void sortID(Student[] students){
		for(int i=0 ; i<students.length-1 ; i++){
			for(int j=i+1 ; j<students.length ; j++){
				if(students[i].id > students[j].id){
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
	}

	static void sortScoreDown(Student[] students){
		for(int i=0 ; i<students.length-1 ; i++){
			for(int j=i+1 ; j<students.length ; j++){
				if(students[i].score < students[j].score){
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
	}
}
