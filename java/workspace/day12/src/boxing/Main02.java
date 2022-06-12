package boxing;

public class Main02 {

	public static void main(String[] args) {
		// 부대지정
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군 1호");
		units[1] = new AirForce("공군 2호");
		units[2] = new Navy("해군 1호");
		units[3] = new Army("육군 1호");
		units[4] = new Army("육군 2호");
		
		// 부대 일괄공격 attack();, 35분까지
		//unit[0].attack();     -> 일괄처리 안했을때.
		//unit[1].attack();
		//unit[2].attack();
		//unit[3].attack();
		//unit[4].attack();
		/*		for(int i = 0; i < units.length; i++) {
			units[i].attack();
		} -> 일괄 처리 했을때.
		 */		
		
		
		// 각 기능의 고유한 기능 호출하는것 추가하기, 4시 30분까지
		for(int i = 0; i < units.length; i++) {
			units[i].attack();
			
			//각 기능의 고유한 기능 호출
			if( units[i] instanceof Army ) {
				Army a = (Army)units[i];
				a.tank();
				
			} else if (units[i] instanceof Navy ) {
				Navy n = (Navy)units[i];
				n.nucleus();
			} else {
				AirForce f = (AirForce)units[i];
				f.bombing();
			}

		}
		
	}

}
