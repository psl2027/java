package operator;

public class Main05 {

	public static void main(String[] args) {
		// x1 값과 y1 값의 결과 확인
		int a1 = 100;
		int x1 = 1;
		int y1 = a1 + x1++;
		System.out.println("y1 : " + y1);
		System.out.println("x1 : " + x1);
		System.out.println("----------------------------");
		
		// x2값과 y2값의 결과 확인
		int a2 = 100;
		int x2 = 1;
		int y2 = a2 + ++x2;
		System.out.println("y2 : " + y2);
		System.out.println("x2 : " + x2);
		
		
		
	}

}
