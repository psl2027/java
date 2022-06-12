package extendsClass;

import articleQnA.FileArticle;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();
		
		qna.setNum(1);
		qna.setTitle("첫 번째 질문입니다.");
		qna.setAnswer("첫 번째 답변입니다.");
		
		System.out.println(qna.getNum());
		System.out.println(qna.getTitle());
		System.out.println(qna.getAnswer());
		System.out.println("-------------------------");
		System.out.println(qna.toSting());
		//qnaarticle 가서 tostring 부분 잘 습득하기

	
		System.out.println("-------------------------");
	
		FileArticle fa = new FileArticle();
		
		fa.setNum(10);
		fa.setTitle("열10번째 자료입니다");
		fa.setFileName("day10.ppt");
		
		
		System.out.println(fa.toString());
	
	
	
	}

}
