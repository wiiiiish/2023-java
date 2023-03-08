package Thread;

public class Ari2 implements Runnable{
	private String skill;
	
	public Ari2(String key) {
		skill = key;
	}
	
	public void run() {
		System.out.println("Ari2 입력 키 : " + skill);
		for (int i=1; i<=3; i++) {
			System.out.println("Ari2 : " + skill + " 스킬 사용 중 " + i + "초");
		}
		System.out.println("Ari2 스킬 사용 종료");
	}
}
