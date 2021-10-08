import java.util.Scanner;
public class StackApp {
	public static void main (String[] args) {
		// scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// 사용자에게 스택 저장 공간 크기를 받기 위한 출력, 입력
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n=scan.nextInt();
		// n개의 문자열이 저장 가능한 StringStack 생성
		StringStack ss=new StringStack(n); 
		// while문
		while(true) {
			// 사용자에게 문자열 입력을 받기 위한 출력, 입력
			System.out.print("문자열 입력 >> ");
			String str=scan.next();
			// '그만'을 입력 받으면 while 문 종료
			if(str.equals("그만"))
				break;
			// str 스택에 저장
			// 스택이 꽉 찼다면 푸시 불가 출력
			if(!ss.push(str)) {
				 System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		// 출력 ("스택에 저장된 모든 문자열 팝 : ")
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		// 현재 스택에 저장된 문자열 개수
		int len=ss.length(); //ss.length();
		// 스택에 저장된 개수만큼 루프
		for(int i=0;i<len;i++) {
			// 스택에서 팝하여 출력
			String s=ss.pop();
			System.out.print(s+" ");
		}
		
		// scanner 닫기
		scan.close();
	}
}
