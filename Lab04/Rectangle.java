package hw;
public class Rectangle {
	// private 변수 - int 타입의 x, y, width, height
	private int x,y,width,height;
	// x, y, width, height 값을 매개변수로 받아 필드를 초기화 하는 생성자
	public Rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	// int square() : 메소드 - 사각형의 넓이 리턴
	public int square() {
		return width*height;
	}
	
	// void show(): 메소드 -   사각형의 좌표와 넓이를 화면에 출력
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width*height+"인 사각형");
	}
	
	//boolean contains(Rectangle r): 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
	public boolean contains(Rectangle s) {
		if((x<s.x) && ((x+width)>(s.x+s.width)) && (s.y>y) && ((y+height)>(s.y+s.height)))
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		// 실습 자료의 메인 함수와 동일
		Rectangle r=new Rectangle(2,2,8,7);
		Rectangle s=new Rectangle(5,5,6,6);
		Rectangle t=new Rectangle(1,1,10,10);
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r))
			System.out.println("t는 r를 포함합니다.");
		if(t.contains(s))
			System.out.println("t는 s를 포함합니다.");
	}

}
