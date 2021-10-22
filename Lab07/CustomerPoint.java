import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CustomerPoint {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// 회원 이름(string), 회원의 포인트 값(integer) type 의 HashMap 생성
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		// 출력 "** 포인트 관리 프로그램입니다 **"
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while (true) {
			// 출력문 "\n이름과 포인트 입력 >> "
			System.out.print("\n이름과 포인트 입력 >> ");
			// 이름 받아오기
			String name=scan.next();
			// 이름 == "그만" ? --> break;
			if(name.equals("그만")) {
				break;
			}
			// 포인트 입력
			int point=scan.nextInt();
			// 해당 이름 가진 고객이 있는지 HashMap 에서 찾기
				// 고객이 존재한다면 --> HashMap에 고객의 이름, 해당 고객의 포인트값 + 입력받은 포인트값
			if(map.get(name)!=null) {
				map.put(name, map.get(name)+point);
			}
			// 고객이 존재하지 않는다면 --> HashMap에 고객의 이름, 고객의 포인트 값 추가해주기.
			else {
				map.put(name,point);
			}
			// HashMap 에서 Key 값 받아오기 -> 위에서 정의해준 Set 변수 사용하기
			Set<String>key=map.keySet();
			// iterator 역시 위에서 정의한 변수로 다시 정의해주기
			Iterator<String>it=key.iterator();
			while(it.hasNext()){
				// iterator 로 부터 Key 값(이름) 받아오기
				String people=it.next();
				// HashMap 으로 부터 Key 값(이름) 이용해서 포인트 값 가져오기
				Integer sum=map.get(people);
				// (이름, 포인트) 형태로 출력
				System.out.print("("+people+", "+sum+")");
			}
		}
		// Scanner 객체 닫기
		scan.close();
	}
}
