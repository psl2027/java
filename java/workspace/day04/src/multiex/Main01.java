package multiex;

public class Main01 {

	public static void main(String[] args) {
		int target = 100;
		// int num = 50; 의 경우는 애러, 안에 int를 또 선언해 주고 있기 때문에
		if ( target == 100 ) {
			int num = target + 100;
			System.out.println(num);
		} else {
			int num = target - 100;
			System.out.println(num);
		}
		
		
	}

}
