package string;

public class Main01 {

	public static void main(String[] args) {
		// 10시~10시10분
		// 이메일 주소에서 아이디(student)와 도메인(java.com)을 구별하기
		
		// 이메일 주소 정의
		// split 사용금지
		String email = "student@java.com";
		
		// '@'이가 나타나는 위치 얻기
		int s = email.indexOf("@");
		
		// 처음부터 '@'이가 나타나는 위치까지 자르기 ->아이디, 
		// 아이디의 길이가 달라질 수 있기 때문에 아래와같이 지정.
		String email_id = email.substring(0, s);
		// "@"이가 나타나는 위치 다음부터 자르기 -> 도메인
		String email_domain = email.substring(s+1);
		
		System.out.println(email_id);
		System.out.println(email_domain);
		
		
		
	}

}
