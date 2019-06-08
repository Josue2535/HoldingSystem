package model;

public abstract class ServiceCompany extends Company{
	
	private Poll[] polls;
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
	public ServiceCompany(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types){
		super(name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type, types);
		polls = new Poll[50];
	}
	
	public Poll[] getPolls(){
		return polls;
	}
	public void	setPolls(Poll[] polls){
		this.polls = polls;
	}
	
	public void addPolls(int serviceRendered, int responseTime, int costBenfit){
		Poll pol = new Poll( serviceRendered,  responseTime,  costBenfit);
		boolean ef = true;
		for(int i = 0; i< polls.length && !ef; i++){
			if(polls[i] == null){
				polls[i] = pol;
				ef = true;
			}
		}
	}
	public int averageTotal(){
		int prome=0;
		int k = 0;
		for(int i = 0; i<polls.length;i++){
			if(polls[i]!= null){	
				prome+=polls[i].average();
				k++;
			}
		}
		return prome/k; 
	}
	
}
