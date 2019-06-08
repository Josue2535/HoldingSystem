package model;

public class FoodCompanies extends ManufacturingCompany{
	private int group;
	
	public FoodCompanies(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, int group){
		super(name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type,  types);
		this.group = group;
	}
	public int getGroup(){
		return group;
	}
	public void setGroup(int group){
		this.group=group;
	}
}