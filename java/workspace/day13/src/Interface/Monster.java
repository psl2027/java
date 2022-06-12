package Interface;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Monster implements Move, Fihgt {
	private String name;

	public Monster(String name) {
		super();
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println(this.name + ">> 공격 합니다.");
	}

	@Override
	public void shild() {
		System.out.println(this.name + ">> 공격을 방어했습니다.");
	}

	@Override
	public void walk() {
		System.out.println(this.name + ">> 걷습니다.");
	}

	@Override
	public void run() {
		System.out.println(this.name + ">> 뜁니다.");
	}

	@Override
	public void jump() {
		System.out.println(this.name + ">> 점프를 합니다.");
	}
	
	
}
