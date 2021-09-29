package exercise;

class ArrayUtil {
	public static int [] concat(int[] a, int[] b) { // 배열 a와 b를 연결한 새로운 배열 리턴
		// 배열 a와 b를 합한 크기의 배열 생성
		int tmp []=new int[a.length+b.length]; 
		// 배열 a를 tmp로 복사 - for문 사용
		for(int i=0;i<a.length;i++) {
			tmp[i]=a[i];
		}
		// 배열 b를 tmp로 복사 - for문 사용
		for(int i=0;i<b.length;i++) {
			int index=a.length+i;
			tmp[index]=b[i];
		}
			// index에 주의 - a 다음에 붙이는 것이므로
		return tmp;
		
		
		
	}
	public static void print(int [] a) { // 배열 a 출력
		System.out.print("[ ");
		// 파라미터로 받아온 배열 출력 - for문 사용
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		

		System.out.println("]");
	}
}

public class StaticEx {
	public static void main(String [] args){
		int [] array1 = { 1, 5, 7, 9 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		//ArrayUtil 클래스의 concat 메소드 사용
		int [] array3=ArrayUtil.concat(array1,array2);
		//ArrayUtil 클래스의 print 메소드 사용하여 array3 출력
		ArrayUtil.print(array3);
	}
}
