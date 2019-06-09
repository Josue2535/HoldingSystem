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
	
	public String recorridoZ(String nombreE){
		String ms = "";
		boolean sd = false;
		boolean se = false;
		boolean sw = false;
		while(!sw){
			if(sd == false){
				for(int i = 0; i<theTower[0].length; i++){
					if(theTower[0][i]!=null && theTower[0][i].getEmployee()!=null){
						if(nombreE.equals(theTower[0][i].getEmployeeName())){
							ms = theTower[0][i].getExtension();
							sw = true;
						}
					}
					
				}
				sd = true;
			}else if(!se){
				for(int k = 1; k<theTower.length-1; k++){
					if(theTower[k][19-k]!=null && theTower[k][18-k].getEmployee()!=null){
						if(nombreE.equals(theTower[k][18-k].getEmployeeName())){
							ms = theTower[k][18-k].getExtension();
							sw = true;
						}
					}
				}
				se = true;
			}else if(se && sw){
				for(int i = 0; i<theTower[0].length; i++){
					if(theTower[theTower.length][i]!=null && theTower[theTower.length][i].getEmployee()!=null){
						if(nombreE.equals(theTower[theTower.length][i].getEmployeeName())){
							ms = theTower[theTower.length][i].getExtension();
							sw = true;
						}
					}
					
				}
				
			}
			
		}
		if(ms.equals("")){
			ms = "No se encontro al empleado";
		}
		return ms;
	}
	
	
}