package object;

class User{
	String subject;
	int age;
	String hobby;
	
	public void setName ( String name, String hobby ) {
		System.out.println( name );
		this.subject = "국비지원";
		this.age = 25;
		this.hobby = hobby;
		System.out.println( "과목 : " + this.subject + ", 나이 : " + this.age + ", 취미 : " + this.hobby);
	//3시 59분쯤 설명해주신거 다시 들어봐야 hobby 이해감
	}
}



public class Main05 {

	public static void main(String[] args) {
		User u1 = new User ();
		// string type이 두개가 생겼으므로 전에 했던 파라미터 갯수가 안맞음
		//u1.setName("자바학생"); , 전에는 setname이 name 하나였음.
		u1.setName("자바학생", "독서");
		
		
		
		
		
		
	}

}
