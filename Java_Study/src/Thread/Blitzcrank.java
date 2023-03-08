package Thread;

public class Blitzcrank {
	private String skill;
	
	public Blitzcrank(String key) {
		skill = key;
	}
	
	public void run() {
		System.out.println("Blitzcrank 입력 키 : " + skill);
		for (int i=1; i<=3; i++) {
			System.out.println("Blitzcrank : " + skill + " 스킬 사용 중 " + i + "초");
		}
		System.out.println("Blitzcrank 스킬 사용 종료");
	}
}
