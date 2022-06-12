package Q2;

public class Main01 {
/*
 * 7. main 메서드를 포함하는 클래스를 생성
 * 8. Student 클래스 객체 생성
 * 9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출
 * 10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출
 */
	public static void main(String[] args) {
		// Student 클래스 객체 생성
		Student st = new Student("박소림", 2, 5, 95, 85, 70);
		
		
		// Student 클래스의 총합, 평균값을 출력하는 메서드 호출
		System.out.println("총점 = " + st.total() + ", 평균 = " + st.avg());		
		
		// Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출
		System.out.println(st.toString());
		
	
	}

}
