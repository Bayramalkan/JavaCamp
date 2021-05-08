package oopIntro;

public class Product {
	
	// encapsulation
	// final demek sadece constructor da set edilebilirsin demek.
	// private sadece bu class ýn  içerisinde geçerli demektir
	private int id; 
	private String name;
	private double unitePrice;
	private String detail;
	private double discount;
	private double unitePriceAfterDiscount;
	
	/*
	public Product() { // constructor
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id, String name, double unitePrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitePrice = unitePrice;
		this.detail = detail;
	}*/
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitePrice, String detail, double discount, double unitePriceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.unitePrice = unitePrice;
		this.detail = detail;
		this.discount = discount;
		this.unitePriceAfterDiscount = unitePriceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitePrice() {
		return unitePrice;
	}

	public void setUnitePrice(double unitePrice) {
		this.unitePrice = unitePrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitePriceAfterDiscount() {
		return this.unitePrice-(this.unitePrice * this.discount / 100);
	}
		
	
	
}
