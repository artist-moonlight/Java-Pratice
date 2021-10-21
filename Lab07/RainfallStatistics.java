import java.util.Scanner;
import java.util.Vector;
public class RainfallStatistics {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// Integer type Vector 변수 생성
		Vector<Integer>v=new Vector <Integer>();
		while(true) {
			// 출력문 "강수량 입력 (0 입력시 종료) >> "
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			// 강수량 입력받기
			int rainfall=scan.nextInt();
			// 입력 받은 강수량 == 0 --> 빠져나가기(while문 종료 조건)
			if(rainfall==0)
				break;
			// 강수량 벡터에 추가
			v.add(rainfall);
			// 합계 변수 = 0
			double avg=0;
			// 벡터 사이즈 만큼 돌면서 각 벡터 변수 출력 + 평균 구하기 위한 합계 구하기
			for(int i=0;i<v.size();i++) {
				System.out.print(v.get(i)+" ");
				avg+=v.get(i);
				
			}
			System.out.println();
			// 최종적으로 합계를 이용하여 평균 구하기 with 벡터의 size 함수 and 출력
			System.out.println("현재 평균 "+avg/v.size());
		}
		// Scanner 객체 닫기
		scan.close();
	}
}
