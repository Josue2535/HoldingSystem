package model;

import java.util.ArrayList;

public class Holding extends LegalPerson{
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
	* @param The type of the company.
	*/
	public Holding(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative, String type){
		super( name,  nit,  address,  phone,  employed,  valueAseets,  constitutionDate,   legalRepresentative,  type);
		companys = new ArrayList<>();
	}
	public ArrayList<Company> getCompanys(){
		return companys;
	}
	public void addSurveys(String name, int s, int t, int c){
		
		ServiceCompany m = null;
		for(int i = 0; i<companys.size(); i++){
			if(name.equals(companys.get(i).getName())){
				if(companys.get(i).getTypes().equals("Public service")){
					
					m = (ServiceCompany)companys.get(i);
					m.addPolls(s,t,c);
				}
			}
		}
	}
	public void addEmployeeHol(Employee a){
		
	}
	public Company findExtens(String name){
		Company m = null;
		for(int i = 0; i<companys.size(); i++){
			if(name.equals(companys.get(i).getName())){
				
					
				m = companys.get(i);
					
				
			}
		}
		return m;
	}
	
	
}
