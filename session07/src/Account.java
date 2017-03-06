
public class Account {
	private String name;
	private double amount;
	public Account(String name, double amt) {
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
	public static void main(String[]args) {
		Account a = new Account("Lucille", 1000);
		System.out.println(a.withdraw(100));
		System.out.println(a.withdraw(1000));
		System.out.println(a.getBalance());
		for (int i = 0; i < 1000000; i++)
			a.deposit(1);
		System.out.println(a.getBalance());
	}
	
}
