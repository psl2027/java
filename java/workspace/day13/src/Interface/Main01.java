package Interface;

public class Main01 {

	public static void main(String[] args) {
		Character ch = new Character("주인공");
		
		ch.walk();
		ch.run();
		ch.attack();
		ch.shild();
		ch.attack();
		ch.shild();
		ch.pickup();
		
		System.out.println("----------------------------");
		Monster mt = new Monster("악당");
		mt.walk();
		mt.run();
		mt.walk();
		mt.run();
		mt.attack();
		mt.shild();
		mt.attack();
		mt.shild();
		
		
		
	}

}
