package hiding;

public class Main02 {

	public static void main(String[] args) {
		// Member 클래스의 객체 생성
	/*	Member mb = new Member("자바학생", 25);
		// name, age 각각 출력
//		mb.setName("자바학생");
//		mb.setAge(24);
// -> 중간에 바꿀 필요가 있을때 사용		
		System.out.println(mb.getAge());
		System.out.println(mb.getName());
		
		mb.setName("자바one");
		mb.setAge(27);
// -> 중간에 바꿀 필요가 있을때 사용		
		System.out.println(mb.getAge());
		System.out.println(mb.getName());
		*/
		Member m = new Member("JAVA학생", 25);
		
		System.out.println("이름 : " + m.getAge());
		System.out.println("나이 : " + m.getName());
		
				
		
		
	}

}
