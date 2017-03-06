
public class MultiThreadAccount {
	private String name;
	private double amount;
	public MultiThreadAccount(String name, double amt) {
		this.name = name; amount = amt;
	}
	public void deposit(double amt) {
		amount += amt;
	}
	public boolean withdraw(double amt) {
		if (amt < amount) {
			amount -= amt;
			return true;
		}
		return false;
	}
	public double getBalance() {
		return amount;
	}
	public static void main(String[]args) throws InterruptedException {
		MultiThreadAccount a = new MultiThreadAccount("Lucille", 1000);
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++)
					a.deposit(1);				
			}
		};
		t1.start();
		System.out.println(a.getBalance());
		Thread.sleep(1);
		System.out.println(a.getBalance());
		
	}
	
}
