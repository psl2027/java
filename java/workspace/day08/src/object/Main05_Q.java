package object;

class Article{
	int seq;		// 글 번호
	String subject; // 글 제목
	String writer;	// 작성자
	
	/*
	 * 파라미터가 존재하는 생성자
	 * 모든 전역변수를 초기화
	 */
	/*public Article(String subject, String writer, int seq) {
		this.subject = subject;
		this.writer = writer;
		this.seq = seq;
	}
	*/
	Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */
	/*void arti() {
		System.out.println( this.subject );
		System.out.println( this.writer );
		System.out.println( this.seq +"쪽");
	}*/
	void print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
		
	}
	
}



public class Main05_Q {

	public static void main(String[] args) {
		/*Article arcle = new Article("혼공자", "박땡땡", 123 );
		Article arcle2 = new Article("생성자", "이땡땡", 30 );
		*/
		// Article 객체 1번 생성
		// 객체.메서드(); (출력메서드 호출)
		//arcle.arti();
		Article art1 = new Article(1, "첫번째 자바 학습", "자바학생");
		art1.print();
		
		System.out.println("------------------------");
		
		// Article 객체 2번 생성
		// 객체.메서드(); (출력메서드 호출)
		//arcle2.arti();
		Article art2 = new Article(2, "자바는 객체지향 언어입니다.", "자바강사");
		art2.print();
	}

}
