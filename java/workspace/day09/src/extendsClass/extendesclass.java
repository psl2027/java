package extendsClass;

public class extendesclass {
	public static void main(String[] args) {
		CalcParent parent = new CalcParent();
		System.out.println( parent.plus(100, 50));
		System.out.println( parent.minus(100, 50));

	System.out.println("=======================");
	
	
	CalcParent child = new CalcChild();
	System.out.println( child.plus(200, 100) );
	System.out.println( child.minus(200, 100) );
	
	System.out.println( child.plus(200, 100) );
	System.out.println( child.minus(200, 100) );
	
	
	
	
	}
}


