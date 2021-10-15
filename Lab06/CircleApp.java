class Circle {
	// int 형 x, y, 반지름 변수 (private)
	private int x,y,r;
	// Circle 생성자 - param (x, y, 반지름)
	public Circle(int x, int y, int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	// toString 함수 (return String)
	public String toString() {
		return "Circle("+x+", "+y+") 반지름"+r;
	}
	// equals 함수 - param (other Circle) : 좌표가 같으면 동일한 것으로 봄
	public boolean equals(Object obj) {
		Circle c=(Circle)obj;
		if(x==c.x && y==c.y) return true;
		else return false;
	}
}

public class CircleApp{
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a : " + a.toString());
		System.out.println("원 b : " + b.toString());
		if (a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("다른 원");
	}
}


