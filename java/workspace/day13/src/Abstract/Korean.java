package Abstract;
/*
 * 
 * 'extends' 키워드를 사용한다.
 */
public  class Korean extends Hello {

	// 부모 생성자의 호출이 이루어진다.
	public Korean(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	
	// 추상화 재정의를 요구한다
	// 추상 메서드를 상속받고 에러를 해결하는 과정에서 부모가 저의하고 있는
	// 메서드를 재정의 하게 된다.
	// 추상클래스는 이와같이 자식클래스가 정의해야 하는 규격을 강제하기 위하여 사용한다.
	@Override
	public void sayHello() {
		
	}

}
