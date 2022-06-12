package articleQnA;

public class Main01 {

	public static void main(String[] args) {
		FileArticle fa = new FileArticle();
		
		fa.setNum(2);
		fa.setTitle("열심히 공부합시다");
		fa.setFileName("Java기초공부");
		
		
		System.out.println(fa.toString());
	}

}
