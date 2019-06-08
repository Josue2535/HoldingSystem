package model;
import java.util.ArrayList;

public class Technology extends Company implements Consumable{
	
	public static final char CONSULTANCY = 'C';
	public static final char TRAINING = 'T';
	public static final char DEVELOPMENT = 'D';
	public static final char INFRASTRUCTURE = 'I';
	public static final char SOFTWARE = 'S';
	public static final char PLATAFORM = 'P';
	
	private ArrayList< Character> services;
	private int energy;
	
	public Technology(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, int energy){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative,  type,  types);
		this.energy=energy;
		services=new ArrayList<>();
	}
	
	public int getEnergy(){
		return energy;
	}
	public void setEnergy(int energy){
		this.energy=energy;
	}
	public ArrayList<Character> getServices(){
		return services;
	}
	public int numberTreesPlanted(){
		int trees = 0;
		
		if(energy>= 1 && energy<= 1000){
			trees = 8;
		}else if(energy>= 1001 && energy<= 3000){
			trees = 55;
		}else if(energy>3000){
			trees = 500;
		}
		
		return trees;
	}
	
}