
public class Multithread {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				while (true) {
					System.out.println("hello");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
		Thread t2 = new Thread() {
			public void run() {
				while (true) {
					System.out.println("bye");
					try {
						Thread.sleep(300);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		
		
	}
}
