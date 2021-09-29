package exercise;

import java.util.Scanner;

public class Grade {
	// 수학, 과학, 영어 점수 변수 선언
	private int math,science,english;
	// Grade 생성자 (파라미터로 수학, 과학, 영어 가짐)
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	// 평균 구하는 함수 선언
	public double average() {
		double a;
		a=(double)(math+science+english)/3;
		return a;
	}
	public static void main(String[] args) {
		// 실습 자료의 메인 함수와 동일
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		// 사용자의 입력으로부터 받아온 점수를 가지고 객체 생성
		Grade me=new Grade(math,science,english);
		// Grade 클래스의 메소드를 가지고 평균 출력
		System.out.println("평균은 "+me.average());
		scanner.close();
		
	}

}
