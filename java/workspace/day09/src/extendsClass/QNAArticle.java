package extendsClass;
/*
 * Article 클래스 상속받고,
 * 부모 클래스의 title 을 질문으로 보고, 답변을 추가
 * main 메서드를 포함하고 있는 class 생성,
 * 글번호, 질문 답변데이터 set
 * 글번호, 질문 답변데이터 get 으로 출력
 */
//4시까지, 4~ 4시10 쉬는시간, 4시 10분 이후로 진행
public class QNAArticle extends Article {
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String toSting() {
		return "질문/답변 [글번호 = " + getNum() 
		     + ", 제목 = " + getTitle() 
		     + ", 답변 = " + getAnswer() + "]";
				
	}
	
	
	
}
