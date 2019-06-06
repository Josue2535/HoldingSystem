package model;
public class Product{
	private String name;
	private String code;
	private double waterAmount;
	private int units;
	
	/**
	* Description: This is the constructor method.
	* @param The name of the product.
	* @param the code of the product.
	* @param The amount of water you used.
	* @param The available units of the product.
	*/
	public Product(String name, String code, double waterAmount, int units){
		this.name = name;
		this.code = code;
		this.waterAmount = waterAmount;
		this.units = units;
	}
} 