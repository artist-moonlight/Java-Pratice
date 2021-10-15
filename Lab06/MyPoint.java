
public class MyPoint {
	//int 형 x, y 변수(private)
	private int x,y;
	// MyPoint 생성자 - param(x, y)
	public MyPoint(int x,int y) {
		this.x=x;
		this.y=y;
	}
	// equals 함수 (return boolean)
	public boolean equals(MyPoint q) {
		if(x==q.x && y==q.y)
			return true;
		else
			return false;
	}
	// toString 함수 (return String)
	public String toString() {
		return "Point("+x+","+y+")";
	}
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("같은점");
		else
			System.out.println("다른점");
	}

}
