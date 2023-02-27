package collection2;

public class Cars {
	public String brand;
	public int mileage;
	public int price;
	
	public String toString() {
		return this.brand+ " : "+this.mileage+" : "+this.price;
	}

	public Cars(String brand,int mileage,int price) {
		this.brand=brand;
		this.mileage=mileage;
		this.price=price;
	}

}
