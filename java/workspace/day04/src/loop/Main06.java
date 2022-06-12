package loop;

public class Main06 {

	public static void main(String[] args) {
		// 구구단 7단, do ~ while 문으로 출력
		// 2시 30분까지
		int j = 0;
		int i = 1;
		
		do {
			j = 7 * i;
			i++;
			System.out.println(j);	
		} while(i < 10);
		
	 }

}
