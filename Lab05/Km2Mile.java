
public class Km2Mile extends Converter{ // extends 상속받을 부모 클래스
	// 생성자 --> KM당 mile 비율 설정
	public Km2Mile(double ratio) {
		super.ratio=ratio;
	}
	
	// 단위 변환 함수(convert) 정의
	protected double convert(double src) {
		return src/ratio;
	}
		
	// 기존 단위명 srcString()
	protected String srcString() {
		return "Km";
	}
		
		// 바꿀 단위명 destString()
	protected String destString() {
		return "mile";
	}	
	

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}



