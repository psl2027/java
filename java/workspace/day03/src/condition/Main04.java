package condition;

public class Main04 {

	public static void main(String[] args) {
		int point = 87;
		
		if ( 90 < point && point <= 100) {
			System.out.println("A");
		} else if( 80 < point && point <= 90) {
			System.out.println("B");
		} else if( 70 < point && point <= 80) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		
		// 100퍼센트 버그를 안낼수 없지만 최대한 여러가지 시도해 보면서 고쳐보기.
		//점수 바꿔보면서 시도해 봐 
	}

}
