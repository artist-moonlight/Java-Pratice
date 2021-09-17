package hw;
import java.util.Scanner;
public class lab2_2 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// 출력 ("2자리수 정수 입력(10~99) ")
		System.out.print("2자리수 정수 입력(10~99)>> ");
		int num=scan.nextInt();// 정수 입력받기
		// 조건문
		if (num%10==num/10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		}
		// scanner 닫기
		scan.close();

	}
}
