package model;
public abstract class LegalPerson{
	//atributos
	private String name;
	private String nit;
	private String address;
	private int phone;
	private int employed;
	private String legalRepresentative;
	private double valueAseets;
	private String constitutionDate;
	private String type;
	
	private Cubicle[][] theTower;
	/**
	* Description: This is the constructor method.
	* @param The name of the company registered <br> whit the chamber of commerce.
	* @param the nit assigned to the company.
	* @param The correspondence address.
	* @param The contact phone.
	* @param The number of employees.
	* @param The value in pesos of the assets.
	* @param the date of incorporation.
	* @param The name of the legal representative.
	* @param The type of organization. 
	*/
	public LegalPerson(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative, String type){
		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employed = employed;
		this.valueAseets = valueAseets;
		this.constitutionDate = constitutionDate;
		this.legalRepresentative = legalRepresentative;
		this.type = type;
		theTower = new Cubicle[7][20]
	}
	
}