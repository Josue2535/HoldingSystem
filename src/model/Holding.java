package model;

import java.util.ArrayList;

public class Holding extends LegalPersn{
	private ArrayList<Company> companys;
	
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
	*/
	public Holding(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative){
		super(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative);
		companys = new ArrayList<>();
	}
	
	
}
