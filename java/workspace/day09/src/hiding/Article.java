package hiding;
// 50분까지
// 하나의 게시물을 표현하기 위한 JavaBeans
public class Article {
	private int seq; 	// 글 번호
	private String subject; // 글 제목
	private String content; // 글 내용
	private String writer; // 작성자
	private int hit; 	// 글 번호
	private String regData; // 작성일자
	
	// 파라미터가 있는 생성자
	public Article(int seq, String subject, String content, String writer, int hit, String regData) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regData = regData;
	}

	
	
	// getter, setter 추가
	public int getSeq() {
		return seq;
	}
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public int getHit() {
		return hit;
	}
	
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	public String getRegData() {
		return regData;
	}
	
	public void setRegData(String regData) {
		this.regData = regData;
	}
	
	
	// main 메서드를 포함하고 있는 클래스에서
	// 객체 생성 및 항목들 출력
	//->main03으로 go!
	
	
}
