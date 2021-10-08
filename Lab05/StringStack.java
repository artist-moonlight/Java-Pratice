public class StringStack implements Stack {
	// String 저장 배열 - 선언 > 스택 저장 공간
	 private String[] element;
	// index, top of stack 선언
	private int tos;
	
	// 생성자 -> 매개변수는 stack capacity
	public StringStack(int capacity) {
		element=new String[capacity];
		tos=-1;
	}
	// Stack 인터페이스에 선언된 다음 4개의 메소드 오버라이딩 구현
	
	// 현재 스택에 저장된 개수 리턴하는 메소드
	public int length() {
		return tos+1;
	}
	// 스택 capacity 리턴
	public int capacity() {
		return element.length;
	}
	// pop 메소드 구현 - 스택 비었을 때 처리
	public String pop() {
		if(tos==-1)
			return null;
		String s=element[tos];
		tos--;
		return s; 
	}



	// push 메소드 구현 - 스택이 꽉 찼을 때 처리
	public boolean push(String str) {
		if(tos==element.length-1)
			return false;
		else {
			tos++;
			element[tos]=str;
			return true;
		}
		
	}
	
}
