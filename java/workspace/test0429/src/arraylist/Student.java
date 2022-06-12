package arraylist;

public class Student {
//	1. java 프로젝트 생성하여(이름은 자유) arraylist package를 생성한다.(10)
//	2. arraylist package안에 Student 클래스, main 메서드를 포함하고있는 클래스(이름은 자유)를 생성한다.(10)
//	3. Student class에, 학생관리를 위한 학생이름, 휴대폰번호, 주소를 담을 접근제어 private 전역변수 3개만 생성한다.(10)
	
	 private String name;
	 private String studentNum;
	 private String Saddress;

// 	4. 3개의 파라미터(매개변수)를 받아서  각각의 전역변수에 값을 할당해주는 생성자를 생성한다.(10)
	 public Student(String name, String studentNum, String saddress) {
		 super();
		 this.name = name;
		 this.studentNum = studentNum;
		 Saddress = saddress;
	 }

//	5. 3번에서 선언한 3개의 전역변수의 getter, setter를 만든다.(10)

		 public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getStudentNum() {
			return studentNum;
		}
	
	
		public void setStudentNum(String studentNum) {
			this.studentNum = studentNum;
		}
	
		public String getSaddress() {
			return Saddress;
		}
	
	
		public void setSaddress(String saddress) {
			Saddress = saddress;
		}


// 6. toString() 메서드를 override해서 해당 클래스명, 각각의 전역변수를 출력해주는 메서드를 생성한다(어노테이션 필수).(10)
		@Override
		public String toString() {
			return "Student [학생이름=" + name + ", 전화번호=" + studentNum + ", 주소=" + Saddress + "]";
		}

		
	
	 



}
