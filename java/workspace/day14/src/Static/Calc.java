package Static;
// SingleTon

public class Calc {
	private static Calc current;
// 	------------- 싱글톤 객체 생성을 위한 준비 시작 -------------------
	public static Calc getInstancs() {
		if( current == null ) {
			current = new Calc();
		}
		
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private Calc() {
		super();
	}
	// -------------------싱글톤 객체 생성을 위한 준비 끝-----------------------
	// 이 클래스가 구현해야 하는 기능
	public void puls(int x, int y) {
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}
	public void minus(int x, int y) {
		int z = x - y;
		System.out.println(x + " - " + y + " = " + z);
	}
	
}
