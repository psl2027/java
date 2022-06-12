package REZ;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.Set;

	public class hotel {
		private Scanner sc;
		private Map<String, customer> hotelMap;
		
		public hotel() {
			sc = new Scanner(System.in);
			hotelMap = new HashMap<>();
		}
		
		
		// 프로그램 시작
		public void hotelOpen() {
			
			while (true) {
				System.out.println("--------------------------------------");
				System.out.println("어떤 업무를 하시겠습니까?");
				System.out.println("1.체크인    2.체크아웃     3.객실상태     4.업무종료");
				System.out.println("--------------------------------------");
				System.out.println();
				
				// 메뉴번호 입력
				int menuNum = sc.nextInt(); 
				sc.nextLine();
				switch (menuNum) {
				case 1:
					checkIn(); // 체크인
					break;
				case 2:
					checkOut(); // 체크아웃
					break;
				case 3:
					roomState(); // 객실상태
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("다시입력해 주세요.");
				} // switch문
			} // while문
		}

		/*
		 * 고객 정보를 삭제하는 메서드
		 */
		private void checkOut() {
			System.out.println();
			System.out.println("체크아웃 하시겠습니까?");
			System.out.print("객실 번호 >> ");
			String rNum = sc.next();
			if(hotelMap.remove(rNum) == null) {
				System.out.println(rNum + " 사용중인 방이 아닙니다.");
			} else {
				System.out.println("체크아웃하셨습니다. 저희 호텔을 이용해주셔서 감사합니다.");
				System.out.println("좋은 하루 되십시오.");
			}
		}
		
		
		
		/*
		 * 호텔에 머무는 고객들의 객실 상태를 알려주는 메서드
		 */
		private void roomState() {
			Set<String> keySet = hotelMap.keySet();
			System.out.println("=====================================");
			System.out.println(" 번호\t객실번호\t\t이름 ");
			System.out.println("=====================================");
			
			if(keySet.size() == 0) {
				System.out.println("등록된 룸이 없습니다");
			} else {
				Iterator<String> it = keySet.iterator();
				
				int count = 0;
				while(it.hasNext()) {
					count++;
					String rNum = it.next();
					customer h = hotelMap.get(rNum);
					System.out.println(" " + count + "번"+ "\t" +"방번호 : "+ h.getrNum() +"\t" + "투숙객 : "+ h.getName());

				}
			}
			System.out.println("================================");
		}
		
		/*
		 * 새로운 고객 정보를 등록하는 메서드
		 */
		private void checkIn() {
			System.out.println();
			System.out.println("어느 방에 체크인 하시겠습니까?");
			System.out.print("방 번호 입력 => ");
			String rNum = sc.next();
			
			if(hotelMap.get(rNum) != null) {
				System.out.println("방이 비어있지 않습니다.");
				return;
			}
			
			sc.nextLine();
			System.out.println("성함이 어떻게 되십니까?");
			System.out.print("이름 입력 => ");
			String name = sc.next();
			
			hotelMap.put(rNum, new customer(rNum, name));
			System.out.println(name + " 체크인 되었습니다.");
			
		}
		
		
		public static void main(String[] args) {
			new hotel().hotelOpen();
		}


	}


