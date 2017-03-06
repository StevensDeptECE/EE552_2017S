
public class MultiThreadAccount2 {
	private String name;
	private double amount;
	public MultiThreadAccount2(String name, double amt) {
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
		MultiThreadAccount2 a = new MultiThreadAccount2("Lucille", 1000);
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++)
					a.deposit(1);				
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 500000; i++)
					if (!a.withdraw(1))
						System.out.println("Withdraw failed!");
			}
		};
		t2.start();
		t1.join();
		t2.join();
		System.out.println(a.getBalance());
		
	}
	
}
