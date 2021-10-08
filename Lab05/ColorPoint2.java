
public class ColorPoint2 extends Point{ // extends 상속받을 부모 클래스
	// 색상 담을 변수 (private)
	private String color;
	// 생성자 parameter 없음. default (0, 0) "BLACK"
	public ColorPoint2() {
		super(0,0);
		this.color="BLACK";
	}
	
	// 생성자 -> x, y 설정
	public ColorPoint2(int x, int y) {
		super(x,y);
	}
	
	// setXY -> x, y 변수 설정 함수
	public void setXY(int x, int y) {
		move(x,y);
	}
	
	// setColor -> 색상 설정 함수
	public void setColor(String color) {
		this.color=color;
	}
	
	// getColor 함수 -> 색상 리턴
	public String getColor() {
		return color;
	}
	// toString 함수 -> "색종류 색의 (x, y)"의 점" return
	public String toString() {
		return getColor()+"색의 ("+getX()+", "+getY()+")의 점";
	}

	
	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
