package multiex;

public class Main01_Main03_answer {

	public static void main(String[] args) {
		// 문제 1. 1 ~ 10 까지 홀수 값의 합(문제 쪼개기)
		// 1~10까지의 합 / 홀수 
		int result = 0;

		for( int i=1; i <= 10; i++ ) {
		
			if( i % 2 ==1 ) { //홀수인 조건
				result += i;
			}
		}
		
		System.out.println("1 ~ 10 까지 홀수 값의 합 : " + result);
		
		System.out.println("-------------------------");
		// 문제 2. 1 ~ 10 까지 짝수 값의 합
		int result2 = 0;

		for( int i=1; i <= 10; i++ ) {
		
			if( i % 2 == 0 ) { //짝수인 조건
				result2 += i;
			}
		}
		
		System.out.println("1 ~ 10 까지 짝수 값의 합 : " + result2);
		//result는 문제 1에서 사용했으니 바꿔주는거 잊지 말기
		//복붙이 나쁜거 아님 단, 오류의 원인 파악하고 바꿀수 있어야 한다.
		
		
		
		System.out.println("-------------------------");
		/*
		 * 문제 3.★  (8*8)
		 * ★★★★★★★★ 
		 * ★★★★★★★★ 
		 * ★★★★★★★★ 
		 * ★★★★★★★★ 
		 * ★★★★★★★★ 
		 * ★★★★★★★★ 
		 * ★★★★★★★★
		 * ★★★★★★★★
		 */
//		System.out.print("test"); // 엔터 없이 출력
//		System.out.println(); // 엔터 있이 출력
		
		//->반복문이 어려우면 엑셀 열어서 이해해보기!
		for( int j = 0; j <= 7; j++ ) {
			for( int i = 0; i <= 7; i++ ) {
				System.out.print("★");
			}
			System.out.println("");	
		}
		
		
		System.out.println("-------------------------");
		/*
		 * 문제 4.★ 
		 * ★★★★★★★★ 
		 * ★★★★★★★ 
		 * ★★★★★★ 
		 * ★★★★★ 
		 * ★★★★ 
		 * ★★★ 
		 * ★★ 
		 * ★
		 */
		for( int j = 0; j <= 7; j++ ) {
			for( int i = j; i <= 7; i++ ) {
				
				System.out.print("★");
			}
			System.out.println("");	
		}
		
		
		
		System.out.println("-------------------------");
		/*
		 * 문제 5. (8*8 문제 참고)
		 * ★ 
		 * ★★ 
		 * ★★★ 
		 * ★★★★ 
		 * ★★★★★ 
		 * ★★★★★★ 
		 * ★★★★★★★ 
		 * ★★★★★★★★
		 */
		
		
		
		for( int j = 7; j >= 0; j-- ) {
			for( int i = j; i <= 7; i++ ) {
				
				System.out.print("★");
			}
			System.out.println("");	
		}
		
		
		
		System.out.println("-------------------------");
		/*
		 * 문제 6. 2단 ~ 9단 구구단 출력 (결과만 나와도 가능), 하나의 통 로직으로만 문제를 풀 수 있어야 한다. 2중 for문, 2중
		 * while문 두개 다 풀어와야 함.
		 */
		
		
		for( int i = 2; i <= 9; i++ ) {
			
			for( int j = 1; j <= 9; j++ ) {
				int k = i * j;
				System.out.println(k);
			}
			System.out.println("------------------");
		}
		
		
		System.out.println("------------while문 시작-------------");
		
		int i = 2;
		int j = 1;
		while( i <= 9 ) {
			
			while( j <= 9 ) {
				int k = i * j;
				System.out.println(k);
				//System.out.print(" ");
				j++;								
			}
			//System.out.println("");
			System.out.println("---------------------");
			i++;
			j = 1; // 이거 안해주면 j 값이 10으로 고정되기 때문에
		}
		
	}

}
