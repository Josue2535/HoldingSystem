package model;

public class Medication extends ManufacturingCompany implements Consumable{
	private String sanitaryRegistration;
	private boolean state;
	private String expiration;
	private String modality;
	
	public Medication(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative, String sanitaryRegistration, boolean state, String expiration, String modality){
		super(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative);
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
}