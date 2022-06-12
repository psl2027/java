/*
 * 2022년, 3월, 26일 작성
 * 작성자 : 박소림
 */


package condition;

public class Main05 {

	public static void main(String[] args) {
		boolean is_korean = true;
		
		if( is_korean == true ) {
			System.out.println("한국사람입니다.");
		}
		
		if( is_korean == false ) {
			System.out.println("한국사람이 아닙니다.");
		}
		
		// 표현방법의 차이를 보여주는 문항
		// 값 자체가 참이므로 성립된다.
		if( is_korean ) {
			System.out.println("한국사람입니다.");
		}
		
		// "!" 는 값을 부정한다. 참을 부정하므로 거짓이다.
		if( !is_korean ) {
			System.out.println("한국사람입니다!!!");
		}
		// 윗문장에 선언을 boolean is_korean = false; 로 할 경우 is_korean 이 false인것을 부정하는 것이기 때문에 true. 출력됨.
		
	}

}
