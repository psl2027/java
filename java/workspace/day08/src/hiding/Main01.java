package hiding;

class Student {
	public String name = "자바학생";
	private int weight = 100;
	//이거 퍼블릭이랑 프라이빗 바꿔가면서 시험해보기
}


public class Main01 {

	public static void main(String[] args) {
		Student std = new Student();
		
		System.out.println( std.name );
		
		// private라 접근 불가능
		//System.out.println( std.weight );
		
		
	}

}
