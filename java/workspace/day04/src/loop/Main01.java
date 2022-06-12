package loop;

public class Main01 {

	public static void main(String[] args) {
		// 반복문
		// 1 ~ 5 까지 합
		// 1 + 2 + 3 + 4 + 5 = 15 -> For문으로 작성
		
		//for문
		int sum = 0;
		//처음에는 초기값을 설정하는 것을 권장(메소드가)
	
		// i 값이 1부터 5까지 증가하는 동안,
		// i 의 값을 sum에 누적한다.
		for(int i = 1; i <= 10; i++ ) {
			// 결과값 누적
			// for 문 안에 System.out.println("i : " + i); 를 입력하면 i값 추적 가능
			// for 문 안에 System.out.println("sum : " + sum); 를 입력하면 sum값 추적 가능
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
