package helper;

public class Util {
//---------- 싱글톤 객체생성 시작-------------------
	private static Util current;
	public static Util getInstance() {
		if (current == null) {
			current = new Util();
		}
		
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private Util() { super(); }
	
	//------- 싱글톤 준비 끝 ---------
	/*
	 * 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	 * @param min - 범위 안에서의 최소값
	 * @param max - 범위 안에서의 최대값
	 * @return min~max 안에서 랜덤값
	 */
	
	public int random( int min, int max ) {
		int num = (int)((Math.random() *(max - min +1)) + min);
		return num;
	}
	
	
	
}
