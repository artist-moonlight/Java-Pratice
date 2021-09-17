package hw;
import java.util.Scanner;
public class lab2_10 {
   public static void main(String[] args) {
      // Scanner 객체 생성
      Scanner scan=new Scanner(System.in);
      // 출력 ("원의 중심 x1, y1, 반지름 radius1 >> ")
      System.out.print("원의 중심 x1, y1, 반지름 radius1 >> ");
      int x1=scan.nextInt();
      int y1=scan.nextInt();
      int r1=scan.nextInt();// x1, y1, r1 입력
      
      // 출력 ("원의 중심 x2, y2, 반지름 radius2 >> "
      System.out.print("원의 중심 x2, y2, 반지름 radius2 >> ");     
      int x2=scan.nextInt();
      int y2=scan.nextInt();
      int r2=scan.nextInt();
      
      // 두 원의 중심 사이의 거리 구하기 (Math.sqrt, Math.pow 활용)
      double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
      // 반지름 합과 중심 사이의 거리 이용
      if(r1+r2>distance) {
    	  System.out.println("두 원은 서로 겹친다.");
      }
      else {
    	  System.out.println("두 원은 서로 겹치지 않는다.");
      }
      // scanner 닫기
      scan.close();
   }
}

