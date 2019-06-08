package model;

public class University extends Education{
	private int knowPro;
	
	public University(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String registry, int accreditedYears, String rectorName, int studentsStratum, int students, int knowPro){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type, types, registry, accreditedYears, rectorName, studentsStratum, students);
		this.knowPro = knowPro;
	}
	public int getKnowPro(){
		return knowPro;
	}
	public void setKnowPro(int knowPro){
		this.knowPro = knowPro;
	}
	
}