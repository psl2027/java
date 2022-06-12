package Q1;

public class Main01 {
/*박소림(2027, 비대면)
 * 7. main 메서드를 포함하는 클래스를 생성 한다.
 * 8. 2개의 정수를 입력 받는다.
 * 9. 입력 받은 정수를 각각 출력 한다.
 * 10. main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수(파라미터) 값으로 넘긴다.
 * 11. main 메서드에서 본인의 이름을 출력한다.
 * 12. Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.
 * 13. Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.
 */
	public static void main(String[] args) {
		// 두개의 정수 입력, 출력
		int a, b;
		a = 10;
		b = 20;
		System.out.println(a);
		System.out.println(b);
		
		
		Calc c1 = new Calc("박소림");
		System.out.println(c1.getName());
		
		System.out.println("더하기 = " + c1.plus(2, 3));
		System.out.println("빼기 = " + c1.minus(6, 3));
		System.out.println("곱하기 = " + c1.multi(5, 2));
		System.out.println("나누기 = " + c1.divide(6, 2));
		
		
	}

}
