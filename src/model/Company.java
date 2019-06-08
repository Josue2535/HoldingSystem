package model;
public abstract class Company extends LegalPerson{
	
	private String type;
	
	/**
	* Description: This is the constructor method.
	* @param The name of the company registered <br> whit the chamber of commerce.
	* @param the nit assigned to the company.
	* @param The correspondence address.
	* @param The contact phone.
	* @param The number of employees.
	* @param The value in pesos of the assets.
	* @param the date of incorporation.
	* @param The name of the legal representative
	* @param The type of the company.
	*/
	public Company(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative, String type){
		super(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative);
		this.type = type;
	}
	public getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
}