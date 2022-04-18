import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("生徒は何人>>");
		int n = sc.nextInt();
		Student[] data= new Student[n];
		for(int i=0;i<data.length;i++){
			System.out.printf("%d人目の名前>>",i+1);
			String name=sc.next();
			System.out.printf("%d人目の点数>>",i+1);
			int score=sc.nextInt();
			Student s= new Student(i+1,name,score);
			data[i]=s;
		}
		while(true){
			System.out.printf("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>>");
			int select = sc.nextInt();
			if(select ==3) break;
			sortData(data,select);
			showData(data);
		}
		System.out.println("アプリケーションを終了します");
	}
	static void showData(Student[] data){
		for(Student s:data){
			s.showInfo();
		}
	}
	static void sortData(Student[] data,int select){
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(select == 1 && data[i].id > data[j].id || select == 2 && data[i].score < data[j].score){
					Student temp= data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
	}
}
