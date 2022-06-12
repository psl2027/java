package multiex;

public class Main03 {

	public static void main(String[] args) {
		// 문제 1. 1 ~ 10 까지 홀수 값의 합
			int o = 0;
			
			
			for(int i = 1; i <= 10; i=i+2) { 
				o += i; 
			}
			System.out.println(o);
		
		
		System.out.println("-------------------------");
		// 문제 2. 1 ~ 10 까지 짝수 값의 합
		 	int e = 0;
		 	
		 	for(int i = 2; i <= 10; i+=2) {
		 		e += i; 
		 	}
		System.out.println(e);
		
		
		
		System.out.println("-------------------------");
		/*
		 * 문제 3.★
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		
		int star = 0;
		int s = 1;
		while(star <= 8) {	
			star = s;
			s++;
			System.out.println("★★★★★★★★");
		}
		
		
		
		
		System.out.println("-------------------------");
		/* 문제 4.★
		 * 	★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		
		
		
		
		
		
		
		
		System.out.println("-------------------------");
		/* 문제 5.★
		 * 	★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		
		
		
		
		
		System.out.println("-------------------------");
		/* 문제 6. 2단 ~ 9단 구구단 출력 (결과만 나와도 가능), 하나의 통 로직으로만 문제를 풀 수 있어야 한다.
		 * 		 2중 for문, 2중 while문 두개 다 풀어와야 함.
		 */
		
		int m = 0;
		for (int i = 1; i <= 9; i++) {
			
		}
			
		
		
		
		
		
	

	
      
 }

}
