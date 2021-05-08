package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+ customer.getFirtsName());
		
		
		Utils.runLogger(loggers, customer.getFirtsName());
		
		
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirtsName());
		
		Utils.runLogger(loggers, customer.getLastName());

	}
}
