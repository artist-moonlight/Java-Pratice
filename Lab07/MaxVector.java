import java.util.Scanner;
import java.util.Vector;
public class MaxVector {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// Integer type Vector 변수 생성
		Vector<Integer>v=new Vector <Integer>();
		// 출력 ("정수(-1이 입력될 때까지)>> ")
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			// 수 입력 받기
			int num=scan.nextInt();
			// 입력 받은 수 == -1 ? --> break;
			if(num==-1)
				break;
			// 벡터에 입력 받은 수 넣기
			else {
				v.add(num);
			}
		}
		// 최대값 저장할 변수 선언
		int biggest=v.get(0);
		// 벡터 사이즈만큼 돌면서 최대값 찾기
		for(int i=1;i<v.size();i++) {
			if(v.get(i)>biggest)
				biggest=v.get(i);
		}
		
		// 최대값 출력
		System.out.println("가장 큰 수는 "+biggest);
		// Scanner 객체 닫기
		scan.close();
	}

}
