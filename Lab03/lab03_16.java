package hw;
import java.util.Scanner;
public class Lab3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		//  { "가위", "바위", "보" } 로 문자열 배열 만들기
		String option[]={ "가위", "바위", "보" } ;
		// 무한 반복
		while(true) {
			System.out.println("컴퓨터와 가위바위보 게임을 합니다");
			System.out.print("가위 바위 보!>> ");
		
			// 사용자로부터 String 입력 받기
			String input=scan.next();
			// 사용자가 "그만"을 입력했으면
			if(input.equals("그만")) {
				break;
			}
			else {
				int n=(int)(Math.random()*3);
				System.out.print("사용자 = "+input+" 컴퓨터 = "+option[n]+", ");
				if(n==0) {
					if(input.equals("가위"))
						System.out.println("비겼습니다");
					else if(input.equals("바위"))
						System.out.println("사용자가 이겼습니다");
					else
						System.out.println("컴퓨터가 이겼습니다");
				}
				else if(n==1) {
					if(input.equals("가위"))
						System.out.println("컴퓨터가 이겼습니다");
					else if(input.equals("바위"))
						System.out.println("비겼습니다");
					else
						System.out.println("사용자가 이겼습니다");
				}
				else {
					if(input.equals("가위"))
						System.out.println("사용자가 이겼습니다");
					else if(input.equals("바위"))
						System.out.println("컴퓨터가 이겼습니다");
					else
						System.out.println("비겼습니다");
				}
			}
				
		}
		scan.close();
	}
}
			
