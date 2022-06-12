package Q2;
/*
 * 1. Student 클래스를 생성 한다.
 * 2. Student 클래스에 private 접근제어의 String 타입의 name, int 타입의 ban, no, kor, eng, math변수 선언
 * 3. 파라미터가 있는 생성자, getter, setter를 생성한다
 * 4. kor, eng, math의 총합을 return하는 메서드 생성
 * 5. kor, eng, math의 평균값을 return하는 메서드를 생성
 * 6. name, ban, no, kor, eng, math 를 출력하는 메서드 생성
 */
public class Student {
	// 변수선언
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// getter, setter
	public String getName() { return name; }
	public void setName(String name) { this.name = name;}
	
	public int getBan() { return ban; }
	public void setBan(int ban) { this.ban = ban; }

	public int getNo() { return no; }
	public void setNo(int no) {	this.no = no; }

	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }

	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }

	public int getMath() { return math; }
	public void setMath(int math) { this.math = math;}

	// kor, eng, math의 총합을 return하는 메서드
	public int total() {
		int result = kor + eng + math;
		return result;
	}
	
	// kor, eng, math의 평균값을 return하는 메서드
	public float avg() {	// int 로 할때 (소수점 없앨때)
		float result = total() / 3.0f;	// int result = (int) (total() / 3.0f);
		return result;
	}

	//name, ban, no, kor, eng, math 를 출력하는 메서드 생성
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + 
				", kor=" + kor + ", eng=" + eng + ", math=" + math + 
				", total = " + total() + ", avg = " + avg() + "]"; 
	}
	
	
	
}
