package hw;
import java.util.Scanner;
public class lab2_8 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		System.out.print("x1, y1 >>");
		int x1=scan.nextInt();
		int y1=scan.nextInt();// x1, y1입력
		System.out.print("x2, y2 >>");
		int x2=scan.nextInt();
		int y2=scan.nextInt();// x2, y2 입력
		 // (x1, y1) 또는(x2, y2) 가 (100, 100),(200,200) 내부에 있을 경우
		if((x1<100 && x2<100)||(y1<100 && y2<100) ||(x1>200 && x2>200)||(y1>200 && y2>200))
			System.out.println("충돌 없음");
		else {
			System.out.println("충돌 발생");
		}
		scan.close();
	}
}
