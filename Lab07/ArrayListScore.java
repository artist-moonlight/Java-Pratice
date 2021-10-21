import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.Scanner;
public class ArrayListScore {
	public static void main(String[] args) {	
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// character type 의 ArrayList 정의해주기
		ArrayList<Character> a = new ArrayList<Character>();
		// 출력문 "6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> "
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			// 스캐너 이용해서 Character 하나 받아오기 --> hint : charAt(0);
			char ch=scan.next().charAt(0);
			// ArrayList 에 받아온 값 추가해주기
			a.add(ch);
		}
		// 성적 합계 구할 변수 선언 double type - 초기화
		double sum=0;
		// ArrayList 크기만큼 반복하면서
		for(int i=0;i<a.size();i++) {
			// ArrayList 로 부터 값을 하나씩 받아옴
			char ch=a.get(i);
			// 받아온 값이 A,B,C,D,F 인지에 따라서 합계 변수에 해당 학점 더해주기 
			// --> HINT : switch 문이나 if 문 자유
			switch(ch) {
			case 'A':
				sum+=4.0;
				break;
			case 'B':
				sum+=3.0;
				break;
			case 'C':
				sum+=2.0;
				break;
			case 'D':
				sum+=1.0;
				break;
			case 'F':
				break;
				
			}
		}
		// 최종적으로 평균 구하기 (합계 변수 / ArrayList 의 크기)
		System.out.println(sum/a.size());
		// Scanner 객체 닫기
		scan.close();
	}
