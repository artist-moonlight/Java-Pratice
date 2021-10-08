
public class ColorPoint extends Point { // extends 상속받을 부모 클래스
	// 색상 담을 변수 (private)
	private String color;
	// 생성자 -> x, y, 색상 설정
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
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
		
	public static void main(String [] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
