package condition;

public class Main06 {

	public static void main(String[] args) {
		char grade = 'F';
		// A라면? D라면? D는 왜 안나오지? -> case를 저장해 놓지 않았으니까!
		switch (grade) {
		case 'A':
			System.out.println("91 ~ 100점 사이입니다.");
			break;
		case 'B':
			System.out.println("81 ~ 90점 사이입니다.");
			break;
		case 'C':
			System.out.println("71 ~ 80점 사이입니다.");
			break;
		
			// A,B,C가 아닌경우.
		default :
			System.out.println("70점 이하입니다.");
			break;

		}
		
		
		
		
	}

}
