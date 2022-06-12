package value;

public class Main02 {

	public static void main(String[] args) {
		// 일반변수
		int width = 100;
		
		// 상수
		final double PI = 3.14D;
		
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);
		
		// 값의 변경
		width = 200;
		// 이 라인은 에러가 발생한다(final 키워드가 붙었기 때문에 에러가 뜸) 
		// PI = 3.141582d;
		
		
		
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);

		
		//-----------------------여기까지 변수 선언이였음-----------------------------\\
	}

}
