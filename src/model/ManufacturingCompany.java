package model;
import java.util.ArrayList;
public class ManufacturingCompany extends Company{
	private ArrayList<Product> products;
	
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
	public ManufacturingCompany(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative){
		super(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative);
		products = new ArrayList<>();
	}
	
}