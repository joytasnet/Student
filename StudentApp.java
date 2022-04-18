import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("何人");
		int number=scan.nextInt();

		Student[] students=new Student[number];
		for(int i=0; i<students.length;i++){
			System.out.print((i+1)+"人目の名前>");
			String name=scan.next();	
			System.out.print((i+1)+"人目の点数>");
			int scores=scan.nextInt();
			students[i]=new Student(i+1,name,scores);
		}
		while(true){
			System.out.print("操作を入力:1..登録順に一覧,2..点数降順に一覧,3..終了>");
			int input=scan.nextInt();

			switch(input){
				case 1:
					for(int i=0; i<students.length-1;i++){
						for(int j=i+1;j<students.length;j++){
							if(students[i].id>students[j].id){
								Student temp=students[i];
								students[i]=students[j];
								students[j]=temp;
							}
						}
					}
					break;
				case 2:
					for(int i=0; i<students.length-1;i++){
						for(int j=i+1;j<students.length;j++){
							if(students[i].score<students[j].score){
								Student temp=students[i];
								students[i]=students[j];
								students[j]=temp;
							}
						}
					}
					break;
				case 3:
					System.out.print("アプリケーションを終了します");
					return;
			}
			for(int i=0;i<students.length;i++){
				students[i].showInfo();
			}
		}	
	}
}
