package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer bayram = new IndividualCustomer();
		bayram.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {bayram,abc,hepsiBurada};
		
		/*
		customerManager.add(hepsiBurada);
		customerManager.add(bayram);
		customerManager.add(abc);
		*/
		
		customerManager.addMultiple(customers);
	}
}
