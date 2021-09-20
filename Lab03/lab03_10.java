package hw;

public class Lab3_10 {
	public static void main(String[] args) {
		// 4 x 4 배열 생성
		int n[][]=new int[4][4];
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				n[i][j]=0;
			}
		}
		// for문으로 10번 반복
		for(int i=0;i<10;i++) {
			int j=0;
			int r=(int)(Math.random()*4);
			int c=(int)(Math.random()*4);
			if(n[r][c]!=0)
				continue;
			else {
				n[r][c]=(int)(Math.random()*9+1);
			}
		}
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
