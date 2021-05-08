package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Levono v14",15000,"16 GB Ram", 10, 13500); // örnek oluþturma, referans oluþturma, instance
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitePrice(16000);
		
		System.out.println(product2.getUnitePriceAfterDiscount());
		/*
		Product product3 = new Product(); 
		
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
			
		}
		
		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
	
	*/
		Category category1 = new Category();
		category1.setID(1);
		category1.setName("Ýçecek");

		Category category2 = new Category();
		category2.setID(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
	}
	
}

