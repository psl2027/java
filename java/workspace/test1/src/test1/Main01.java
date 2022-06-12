package test1;
// 박소림 2027
public class Main01 {

	public static void main(String[] args) {
//	1 부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.(코드작성)(35)
	
		int num = 0;

		for ( int i = 1; i <= 20; i++ ) {

			if ( i%2 != 0 && i%3 != 0 ) {

				num += i;
			}

		}
		System.out.println(num);
	}
}
