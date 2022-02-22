package oopExamples;

public class Product {
	
	//encapsulation
	// attribute ,field
	private String _name;
	private double _price;
	private int _id;
	private int _stockAmount;
	
	// getter
	public int getId() {
		
		return _id;
	}
	
	// setter
	public void setId(int id) {
		
		_id=id;
	}

	//////////
	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	
	//////////////////////
	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

}
