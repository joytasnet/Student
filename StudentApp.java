import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("生徒は何人>");
		int num = scan.nextInt();
		Student[] students = new Student[num];
		for(int i=0;i<students.length;i++){
			int id = i+1;
		  System.out.printf("%d人目の名前>",i+1);
			String name =scan.next();
		  System.out.printf("%d人目の点数>",i+1);
			int score =scan.nextInt();
			students[i]= new Student(id,name,score);
		}
		System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3:...終了>");   //表示選択
		int act = scan.nextInt();
		switch(act){
			case 1:
				idSort(students);
				break;
			case 2:
				scoreSort(students);
				break;
			case 3:
				System.out.println("アプリケーションを終了します");
				return;
		}
		for(Student para :students){                //全部出力
			para.showInfo();
		}
	}
	public static void idSort(Student[] arr){     //idでソート
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].id > arr[j].id){
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void scoreSort(Student[] arr){         //点数降順
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].score < arr[j].score){
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
