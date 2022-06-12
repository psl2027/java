package Q1;
/*박소림(2027,비대면)
 *  1. Calc 클래스를 생성 한다.
 *  2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.
 *  3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.
 *  4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.
 *  5. int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.
 *  6. int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다.
 */


public class Calc {
	private String name;
	public Calc(String name) {
		this.name = name;
	}
	//전역변수 및 getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// int 덧셈, 뺄셈
	public int plus ( int x, int y ) { return x + y; }
	public int minus( int x, int y ) { return x - y; }
	
	// int 곱셈, 나눗셈
	public int multi ( int x, int y ) { return x * y; }
	public int divide ( int x, int y ) { return x / y; }
	

}
