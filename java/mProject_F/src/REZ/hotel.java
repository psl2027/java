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
		
		
		// ���α׷� ����
		public void hotelOpen() {
			
			while (true) {
				System.out.println("--------------------------------------");
				System.out.println("� ������ �Ͻðڽ��ϱ�?");
				System.out.println("1.üũ��    2.üũ�ƿ�     3.���ǻ���     4.��������");
				System.out.println("--------------------------------------");
				System.out.println();
				
				// �޴���ȣ �Է�
				int menuNum = sc.nextInt(); 
				sc.nextLine();
				switch (menuNum) {
				case 1:
					checkIn(); // üũ��
					break;
				case 2:
					checkOut(); // üũ�ƿ�
					break;
				case 3:
					roomState(); // ���ǻ���
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�ٽ��Է��� �ּ���.");
				} // switch��
			} // while��
		}

		/*
		 * �� ������ �����ϴ� �޼���
		 */
		private void checkOut() {
			System.out.println();
			System.out.println("üũ�ƿ� �Ͻðڽ��ϱ�?");
			System.out.print("���� ��ȣ >> ");
			String rNum = sc.next();
			if(hotelMap.remove(rNum) == null) {
				System.out.println(rNum + " ������� ���� �ƴմϴ�.");
			} else {
				System.out.println("üũ�ƿ��ϼ̽��ϴ�. ���� ȣ���� �̿����ּż� �����մϴ�.");
				System.out.println("���� �Ϸ� �ǽʽÿ�.");
			}
		}
		
		
		
		/*
		 * ȣ�ڿ� �ӹ��� ������ ���� ���¸� �˷��ִ� �޼���
		 */
		private void roomState() {
			Set<String> keySet = hotelMap.keySet();
			System.out.println("=====================================");
			System.out.println(" ��ȣ\t���ǹ�ȣ\t\t�̸� ");
			System.out.println("=====================================");
			
			if(keySet.size() == 0) {
				System.out.println("��ϵ� ���� �����ϴ�");
			} else {
				Iterator<String> it = keySet.iterator();
				
				int count = 0;
				while(it.hasNext()) {
					count++;
					String rNum = it.next();
					customer h = hotelMap.get(rNum);
					System.out.println(" " + count + "��"+ "\t" +"���ȣ : "+ h.getrNum() +"\t" + "������ : "+ h.getName());

				}
			}
			System.out.println("================================");
		}
		
		/*
		 * ���ο� �� ������ ����ϴ� �޼���
		 */
		private void checkIn() {
			System.out.println();
			System.out.println("��� �濡 üũ�� �Ͻðڽ��ϱ�?");
			System.out.print("�� ��ȣ �Է� => ");
			String rNum = sc.next();
			
			if(hotelMap.get(rNum) != null) {
				System.out.println("���� ������� �ʽ��ϴ�.");
				return;
			}
			
			sc.nextLine();
			System.out.println("������ ��� �ǽʴϱ�?");
			System.out.print("�̸� �Է� => ");
			String name = sc.next();
			
			hotelMap.put(rNum, new customer(rNum, name));
			System.out.println(name + " üũ�� �Ǿ����ϴ�.");
			
		}
		
		
		public static void main(String[] args) {
			new hotel().hotelOpen();
		}


	}


