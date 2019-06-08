package model;
public abstract class LegalPerson{
	//atributos
	private String name;
	private String nit;
	private String address;
	private int phone;
	private int employee;
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
	public LegalPerson(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type){
		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employee = employee;
		this.valueAseets = valueAseets;
		this.constitutionDate = constitutionDate;
		this.legalRepresentative = legalRepresentative;
		this.type = type;
		theTower = new Cubicle[7][20];
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getNit(){
		return nit;
	}
	public void setNit(String nit){
		this.nit = nit;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public int getPhone(){
		return phone;
	}
	public void setPhone(int phone){
		this.phone = phone;
	}
	public int getEmployee(){
		return employee;
	}
	public void setEmployee(int employee){
		this.employee = employee;
	}
	public double getValueAseets(){
		return valueAseets;
	}
	public void setValueAseets(double valueAseets){
		this.valueAseets = valueAseets;
	}
	public String getConstitutionDate(){
		return constitutionDate;
	}
	public void setConstitutionDate(String constitutionDate){
		this.constitutionDate = constitutionDate;
	}
	public String getLegalRepresentative(){
		return legalRepresentative;
	}
	public void setLegalRepresentative(String legalRepresentative){
		this.legalRepresentative = legalRepresentative;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
}