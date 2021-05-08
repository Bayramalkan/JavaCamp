package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(),new EmailLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer bayram = new Customer(1,"Bayram","Alkan");
		
		customerManager.add(bayram);
		
	}

}
