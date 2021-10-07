
public class ColorTV extends TV{ // extends 상속받을 부모 클래스
	// 색상 수를 담을 변수(color) 생성 (private)

	private int color;

	// 생성자 -> 사이즈 설정, 색상 수 설정
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	
	}
	
	// getColor 함수 -> 색상 수 반환
	public int getColor() {
		return color;
	}
	
	// printProperty 함수 -> "x 인치 y 컬러" print
	public void printProperty() {
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}
	
	
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
