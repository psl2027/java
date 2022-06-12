package REZ;
/*
 * 고객정보 저장
 */

public class customer{
	private String rNum;
	private String name;
	
	public customer(String rNum, String name) {
		super();
		this.name = name;
		this.rNum = rNum;
	}
	
	public String getrNum() {
		return rNum;
	}


	public void setrNum(String rNum) {
		this.rNum = rNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Hotel [rNum=" + rNum + ", name=" + name + "]";
	}
}
