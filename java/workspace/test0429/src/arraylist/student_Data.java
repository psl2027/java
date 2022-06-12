package arraylist;

import java.util.ArrayList;
//7. Student 객체를 담기위한 arraylist 생성.(객체명 자유)(10)

public class student_Data {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
// 8. 7번에서 생성한 객체에 for문을 사용하여 10명의 학생 데이터를 임의로 각각 다르게 add한다.(5)		
		for( int i = 0; i<10; i++ ) {
			Student s = new Student("학생" + i, "010-1234-567" + i, "서울" + i);
			list.add(s);			

		}
// 9. 7번에서 생성한 arraylist의 크기를 출력한다.(10)		
		int count = list.size();
		System.out.println("list 크기 : " + count);
		
System.out.println("------------------------------------------------");		
		
// 10. 7번에서 생성한 arraylist의 5번째 요소를 출력한다.(5)
		Student value = list.get(4);
		System.out.println("5번째 요소의 값 : " + value);

		System.out.println("------------------------------------------------");		
		
// 11. 7번에서 생성한 arraylist의 5번째 요소를 삭제한다.(5)
		list.remove(4);

		Student value1 = list.get(4);
		System.out.println("5번째 요소의 값 : " + value1);
		
		System.out.println("------------------------------------------------");		

// 12. 7번에서 생성한 arraylist에 담긴 데이터를 for문과 
//	   Student 클래스에서 생성한 toString() 메서드를 사용하여 출력한다.(5)
		for( int i = 0; i<list.size(); i++ ) {

			Student item = list.get(i);
			System.out.println( list.get(i) );
			System.out.println( item.toString() );
			System.out.println("----------------");
		}
		
		
		
	}
}