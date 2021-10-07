
public class Won2Dollar extends Converter{ // extends 상속받을 부모 클래스
	// 생성자 --> 환율 설정
	public Won2Dollar(double ratio) {
		super.ratio=ratio;
		
	}
	
	// 단위 변환 함수(convert) 정의
	protected double convert(double src) {
		return src/ratio;
	}
	
	// 기존 단위명 srcString()
	protected String srcString() {
		return "원";
	}
	
	// 바꿀 단위명 destString()
	protected String destString() {
		return "달러";
	}	
	

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
