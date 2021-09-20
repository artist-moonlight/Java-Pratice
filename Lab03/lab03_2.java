package hw;
import java.util.Scanner;
public class Lab3_2 {
	public static void main(String[] args) {
		// 2차원 배열 초기화 : { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } }
		int n[][]= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		// 2중 for문 및 배열의 길이를 사용하여 출력 
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
