package method;

/* 25분 까지
 *  문제1, "Hello, World~", "메서드가 호출되었습니다." 를
 *  출력하는 메서드를 각각 만들어서 호출하세요
 */


public class Main05_Q1 {

	public static void main(String[] args) {
		f();
		M();
		System.out.println(returnM());
	}
	
	public static String returnM() {
		return "문자열";
	}

	public static void f() {
		System.out.println("Hello, World~");
	}
	public static void M() {
		System.out.println("메서드가 호출되었습니다.");
		
	}
	

}
