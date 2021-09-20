package hw;
import java.util.Scanner;
public class Lab3_8 {
	public static void main(String[] args) {

		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// 출력 ("정수 몇개? ")
		System.out.print("정수 몇개? ");
		// size 입력받기
		int size=scan.nextInt();
		// size 크기의 배열 생성
		// new 연산자를 사용하면 boolean 배열은 false로 초기화 됨
		boolean check[] = new boolean[101];
		// for문 사용{
		for(int i=1;i<=size;i++) {
			
			// 난수 생성
			int r=(int)(Math.random()*100+1);
			while(check[r]==true) {
				r=(int)(Math.random()*100+1);
			}
			check[r]=true;			// 생성한 정수 출력
			System.out.print(r+" ");
			// 10번째 수일 때 new line 해주기
			if(i%10==0) {
				System.out.println();
			}
		}
		// Scanner 닫기
		scan.close();
	}
}
