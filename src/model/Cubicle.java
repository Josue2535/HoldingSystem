package model;

public class Cubicle{
	private String extension;
	private Employed[] employed;
	/**
	* Description: This is the constructor method.
	* @param The name of the product.
	* @param the code of the product.
	* @param The amount of water you used.
	* @param The available units of the product.
	*/
	public Cubicle(String extension, Employed[] employed){
		this.extension = extension;
		this.employed = employed;
	}
}