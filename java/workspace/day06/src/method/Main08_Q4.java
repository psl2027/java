package method;
/*
 * 문제4, 반환값이 있고, 받는 인자값(매개변수, 파라미터)이 있는 메서드를 구현해 보세요
 */
public class Main08_Q4 {

	public static void main(String[] args) {
		int k = y(1,2);
		System.out.println(k);
		System.out.println(y(10, 20));
		System.out.println(y(10, 30));
		System.out.println(y(10, 40));
	}
	public static int y(int x, int z) {
		int k = x+z;
		return k;
	}
}
