package overload;

class Hello {
	Hello() {
		System.out.println("Hello");
	}

	//넘어오는 생성자 하나 더 설정
	Hello( String msg) {
		System.out.println( msg );
	}
}




public class Main02 {

	public static void main(String[] args) {
		Hello h1 = new Hello();		
		Hello h2 = new Hello("월요일 입니다.");		
		
		
	}

}
