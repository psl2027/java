package scanner;

import java.util.Scanner;

public class Main02 {
/*
 * scanner.next()	: 공백 전까지 입력을 받음
 * scanner.nextline()	: 한줄 전체를 입력 받음
 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 입력1 : ");
		String str1 = scanner.nextLine();
		System.out.println( str1 );
		
		System.out.println("문자열 입력2 : ");
		String str2 = scanner.next();
		System.out.println( str2 );
		
		
		
		scanner.close();
	}

}
