package object;
// 2시 30분까지, 중간체크
// 선생님이 주신 파일에서 정답 확인 잘 해보기!
class Calc {
	// plus, param int x, int y, 덧셈의 결과를 return
	int plus(int x, int y) { return x + y; }
	
	// minus, param int x, int y, 뺄셈의 결과를 return
	int minus(int x, int y) { return x - y; }
	
	// times, param int x, int y, 곱셈의 결과를 return
	int times(int x, int y) { return x * y; }
	
	// divide, param int x, int y, 나눗셈의 결과를 return
	int divide(int x, int y) { 
		int result1 = 0;
			if( y !=0 ) { // 0으로 나눌수 없으므로
				result1 = x/y;
			}
		
		return result1;
	}
}


public class Main04_Q1 {

	public static void main(String[] args) {
		// 객체생성
		Calc c1 = new Calc();		
		// plus
		int a = c1.plus(100, 50);
		System.out.println( "100 + 50 : " + a );
		// minus
		System.out.println( "100 - 50 = " + c1.minus(100, 50) );		
		// times
		int c = c1.times(20, 5);
		System.out.println( "*times : " + c );
		System.out.println( "100 * 50 = " + c1.times(100, 50) );		
		// divide
		int d = c1.divide(20, 5);
		System.out.println( "*divide : " + d );
		System.out.println( "100 / 50 = " + c1.divide(100, 50) );		
		
		
		
		
	}

}
