package Thread;

public class Main {
	public static void main(String[] args) {
		String[] key = {"Q", "W", "E"};
		
		for (int i=0; i<key.length; i++) {
			Blitzcrank b = new Blitzcrank(key[i]);
			b.run();
		}
		
		System.out.println("====================");
		for(int i=0; i<key.length; i++) {
			Ari a = new Ari(key[i]);
			a.start();
		}
		
		System.out.println("====================");
		for(int i=0; i<key.length; i++) {
			Thread thread = new Thread(new Ari2(key[i]));
			thread.start();
		}
	}
}
