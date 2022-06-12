package object;

class HelloWorld {
	// 멤버변수(전역변수)는 모든 메서드가 공유한다.
	String message;
	int num;
	// 전역변수 메세지를 단순히 출력해주는 메서드
	void sayHello() {System.out.println( message );}
	// 전역변수 메세지에 문자(열)를 할당해주는 메서드
	void setEng() {message = "Hello Java";}
	void setKor() {message = "안녕하세요. 자바";}
}
// void = return이 없다
public class Main03 {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		
		// 메서드 호출 
		// 출력을 먼저 해버리면 아무것도 아닌 값이 들어가기 때문에 null 로 뜸.
		hello.sayHello();
		hello.setEng();
		hello.sayHello();
		hello.setKor();
		hello.sayHello();
		hello.setEng();
		hello.setKor();
		hello.sayHello();
		
	}

}

// Q1. int타입은 선언만하고 출력하면 값이 할당되지않아 오류인데 string선언은 선언만하고 출력해도 null이 저장되어 오류가 안나는건가요?
// int라해서 오류는 나지 않는데, 0 이 뜨더라 
// Q2. 메인함수에서는 둘다 선언만하고 출력하면 에러나는데 클래스선언하여 메서드 호출 출력하면 에러가안나는 이유가 궁굼합니다!
// 나중에 말해줌

