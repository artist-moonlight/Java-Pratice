class Shape{
	public void draw() {
		System.out.println("shape");
	}
}
class Circles extends Shape{
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("circle");
	}
}
public class Circlemanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circles();
		((Circles) s).paint();
		
	}

}
