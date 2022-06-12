package loop;

public class Main10 {

	public static void main(String[] args) {
	// for 문
		// 문제1. 1~50까지 숫자의 합
		int sum = 0;
		
		for(int i = 1; i <=50; i++ ) {
			sum += i;
		}
		System.out.println(sum);
	
	System.out.println("-------------------");

		// 문제2. 구구단 2단
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// 2 * 4 = 8
		// 2 * 5 = 10
		// 2 * 6 = 12
		// 2 * 7 = 14
		// 2 * 8 = 16
		// 2 * 9 = 18
		int j = 0;
		
		for(int i = 1; i < 10; i++ ) {
			j = 2 * i;
			System.out.println(j);
		}
	System.out.println("-------------------");
		
	// while 문
		//문제1. 10번 찍어 안 넘어 가는 나무 없다.
		// 나무를 1번 찍었습니다.
		// 나무를 2번 찍었습니다.
		// ...
		// 나무를 10번 찍었습니다.
		// 나무가 넘어갑니다.

		int tree = 0;
		int i = 0;

		while (i< 10) {
			tree += i;
			i++;
			System.out.println("나무를 " + i + "번 찍었습니다.");			
		}
		System.out.println("나무가 넘어갑니다.");
		
	System.out.println("-------------------");
	
	}

}
