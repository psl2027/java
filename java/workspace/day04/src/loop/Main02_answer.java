package loop;

public class Main02_answer {

	public static void main(String[] args) {
		// 구구단 7단의 결과 값 (반복문)
		// 11시 30분
		
		int j = 0;
		// int i = 1; -> 밖에다가 선언 가능.
		// 단, 밖에 선언했을 경우 for 구문이 for( ; i < 10; i++ ) 이렇게 됨.
		for( int i = 1; i < 10; i++ ) {
			j = 7 * i ;
			
			System.out.println(j);
		}

	}

}
