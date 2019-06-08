package model;

public class Medication extends ManufacturingCompany implements Consumable{
	private String sanitaryRegistration;
	private boolean state;
	private String expiration;
	private String modality;
	
	public Medication(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String sanitaryRegistration, boolean state, String expiration, String modality){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type, types);
		this.sanitaryRegistration = sanitaryRegistration;
		this.state = state;
		this.expiration = expiration;
		this.modality = modality;
	}
	public String getSanitaryRegistration(){
		return sanitaryRegistration;
	}
	public void setSanitaryRegistration(String sanitaryRegistration){
		this.sanitaryRegistration=sanitaryRegistration;
	}
	public boolean getState(){
		return state;
	}
	public void setState(boolean state){
		this.state=state;
	}
	public String getModality(){
		return modality;
	}
	public void setModality(String modality){
		this.modality=modality;
	}
	public String getExpiration(){
		return expiration;
	}
	public void setExpiration(String expiration){
		this.expiration=expiration;
	}
	public int numberTreesPlanted(){
		int trees = 0;
		int agua = 0;
		for(int i = 0; i<getProducts().size(); i++){
			agua += getProducts().get(i).getWaterAmount();
		}
		if(agua>= 1 && agua<= 140){
			trees = 6;
		}else if(agua>= 141 && agua<= 800){
			trees = 25;
		}else if(agua>800){
			trees = 200;
		}
		
		return trees;
	}
}