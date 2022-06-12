package array;

public class Main02 {

	public static void main(String[] args) {
		//11시 30분까지
		
		// 문제 1, num 배열에 저장된 요소의 합을 구하시오
		
		int[] num = new int[] {22, 3, 8, 12, 6};
		int j = 0;
		for(int i = 0; i<num.length; i++) {
			j += num[i];
		}
		System.out.println(j);
		
		
		System.out.println("----------------------");
		// 문제2, num2 배열에 저장된 요소의 합과 평균을 구하시오
		
		int[] num2 = new int[] {60, 95, 88};
		int pa = 0;
		for(int i = 0; i<num2.length; i++) {
			pa += num2[i];
		
		}
		System.out.println("합 : " + pa + ", 평균 : " + pa/num2.length);
		
		
		System.out.println("----------------------");
		
		
		// 문제3, num3 배열에 저장된 요소의 최대값을 출력하시오.
		
		int[] num3 = {94, 85, 95, 88, 90};
		int b = 0;
		for(int i = 0; i<num3.length; i++) {
			if(b>num3[i]) {
				
			} else {
				b = num3[i];
			}
		}
		System.out.println(b);
		
		// 문제4, num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		
		int[] num4 = new int[] {22, 3, 8, 12};
		int even = 0; // 짝수 합
		int odd = 0;// 홀수 합
		
		
		
	}

}
