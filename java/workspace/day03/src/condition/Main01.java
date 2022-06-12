package condition;

public class Main01 {

	public static void main(String[] args) {
		int myage = 19;
		
		if( myage == 19 ){
			System.out.println("19살 입니다.");
		} // T
		
		if ( myage != 20) {
			System.out.println("20살이 아닙니다.");
		} // T
		
		if ( myage > 19) {
			System.out.println("성인입니다.");
		} // F
		
		if ( myage <= 20) {
			System.out.println("학생입니다.");
		} // T
		
		//System.out.println("실행결과");
		
		
		
	}

}
