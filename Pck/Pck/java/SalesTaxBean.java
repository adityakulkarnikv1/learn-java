package java;

public class SalesTaxBean {
	
	private String Item="";
	
	private int Quantity=0;
	
	private double Price=0.00;
	
	private String Imported;
	
	private String  FoodProd;

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getImported() {
		return Imported;
	}

	public void setImported(String imported) {
		Imported = imported;
	}

	public String getFoodProd() {
		return FoodProd;
	}

	public void setFoodProd(String foodProd) {
		FoodProd = foodProd;
	}

}
