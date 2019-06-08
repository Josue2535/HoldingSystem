package model;

public class HighSchool extends Education{
	private int know11;
	
	public HighSchool(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String registry, int accreditedYears, String rectorName, int studentsStratum, int students, int know11){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type, types, registry, accreditedYears, rectorName, studentsStratum, students);
		this.know11 = know11;
	}
	public int getKnow11(){
		return know11;
	}
	public void setKnow11(int know11){
		this.know11 = know11;
	}
}