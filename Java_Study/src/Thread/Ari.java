package Thread;

public class Ari extends Thread{
	private String skill;
	
	public Ari(String key) {
		skill = key;
	}
	
	public void run() {
		System.out.println("Ari 입력 키 : " + skill);
		for (int i=1; i<=3; i++) {
			System.out.println("Ari : " + skill + " 스킬 사용 중 " + i + "초");
		}
		System.out.println("Ari 스킬 사용 종료");
	}

}
