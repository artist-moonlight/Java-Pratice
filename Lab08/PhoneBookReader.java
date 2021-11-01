import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookReader {

	public static void main(String[] args) {
		// File 생성 - 파일 정보 : "C:/classJava/JAVA/Lab08/phone.txt"
		File file=new File("C:/classJava/JAVA/Lab08/phone.txt");
		// FileReader 선언 init:null
		FileReader fr=null;
		// 문자를 읽어올 변수
		int c=0;
		try {
			// FileReader 사용해서 file 읽어오기
			fr=new FileReader(file);
			// while ... fileReader 에서 읽어온 값 (read) 이 != -1
			while((c=fr.read())!=-1)
				// 화면에 출력 (int to char)
				System.out.print((char)c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fileReader != null --> fileReader.close() with try&catch
			try {
				fr.close();
			}
			catch(IOException e) {
				
			}
			
			
		}
	}

}
