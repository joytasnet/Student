import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("生徒は何人>");
		int num=scan.nextInt();
		Student[] students = new Student[num];
		int[] scores = new int[num];
		for(int i=0;i<num;i++){
			int id=i+1;
			System.out.printf("%d人目の名前>",id);
			String name=scan.next();
			System.out.printf("%d人目の点数>",id);
			int score=scan.nextInt();
			scores[i]=score;
			students[i]=new Student(id,name,score);
		}
		System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
		int command=scan.nextInt();
		if(command==1){
			for(int i=0;i<num;i++){
				students[i].show();
			}
		}
		if(command==2){
			for(int i=0;i<scores.length-1;i++){
				for(int j=i+1;j<scores.length;j++){
					if(scores[i]<scores[j]){
						int temp1=scores[i];
						scores[i]=scores[j];
						scores[j]=temp1;
						Student temp2=students[i];
						students[i]=students[j];
						students[j]=temp2;
					}
				}
			}
			for(int i=0;i<num;i++){
				students[i].show();
			}
		}if(command==3){
			System.out.println("アプリケーションを終了します");
		}
	}
}
