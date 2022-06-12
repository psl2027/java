package method;
/*
 * 문제3, 반환값이 있고 받는 인자값(매개변수, 파라미터)이 없는 메서드를 구현하세요
 */
public class Main07_Q3 {

	public static void main(String[] args) {
		int t = z();
		System.out.println(t);
		//이것도 가능
		System.out.println(z());
	}
	public static int z() {
		int x = 100;
		
		return x;
	}
}
