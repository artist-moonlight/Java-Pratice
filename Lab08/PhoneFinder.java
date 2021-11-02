import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class PhoneFinder {
	public static void main(String[] args) {
		// Scanner 객체 선언
		// HashMap 객체 생성 
		HashMap<String, String> phone=new HashMap<String,String>();
		// File - "C:/classJava/JAVA/Lab08/phone.txt" 생성
		File file = new File("C:/classJava/JAVA/Lab08/phone.txt");
		// FileReader 선언 init : null
		FileReader fr=null;
		try {
			// fileReader 로 file 읽어오기
			fr=new FileReader(file);
			// Scanner 이용해서 File 바로 읽어오기
			Scanner fileScanner=new Scanner(new FileReader(file));

			// while ... scanner 값.hasNext() {
			while(fileScanner.hasNext()) {
				// name = scanner.next() 값 받기
				String name=fileScanner.next();
				// tel = scanner.next() 값 받기
				String tel=fileScanner.next();
				// hashMap 에 넣기 (name, tel)
				phone.put(name, tel);
			}
			// scanner 닫기
			fileScanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 출력 "총 " + hashMap.size() + "개의 전화번호를 읽었습니다."
			System.out.println("총"+phone.size()+"개의 전화번호를 읽었습니다.");
		}
		Scanner scan=new Scanner(System.in);
		// while(true){
		while(true) {
			// 출력 "이름 >> "
			System.out.print("이름 >> ");
			// 이름 입력
			String name=scan.next();;
			
			// 이름 == "그만" ? break;
			if(name.equals("그만")) break;
			// hashMap에서 받아온 이름으로 검색 != null
			String tel=phone.get(name);
			if(tel==null) {
				System.out.println("찾는 이름이 없습니다.");
			}
				// hashMap으로 부터 받아와서 출력 "전화번호 : " + hashMap.get(name)
			else {
				System.out.println("전화번호 : " +phone.get(name));
			}
		}
		// scanner 닫기
		scan.close();	
	}
}
