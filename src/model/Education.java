package model;

public abstract class Education extends ServiceCompany implements Taxable{
	private String registry;
	private int accreditedYears;
	private String rectorName;
	private int studentsStratum;
	private int students;
	
	public Education(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String registry, int accreditedYears, String rectorName, int studentsStratum, int students){
		super( name,  nit,  address,  phone,  employee,  valueAseets,  constitutionDate,   legalRepresentative,  type,  types);
		this.registry = registry;
		this.accreditedYears = accreditedYears;
		this.rectorName = rectorName;
		this.studentsStratum = studentsStratum;
		this.students = students;
	}
	public String getRegistry(){
		return registry;
	}
	public void setRegistry(String registry){
		this.registry = registry;
	}
	public int getAccreditedYears(){
		return accreditedYears;
	}
	public void setAccreditedYears(int accreditedYears){
		this.accreditedYears = accreditedYears;
	}
	public String getRectorName(){
		return rectorName;
	}
	public void setRectorName(String rectorName){
		this.rectorName = rectorName;
	}
	public int getStudentsStratum(){
		return studentsStratum;
	}
	public void setStudentsStratum(int studentsStratum){
		this.studentsStratum = studentsStratum;
	}
	public int students(){
	return students;
	}
	public void students(int students){
		this.students = students;
	}
	
	public double calctTaxeble(){
		double pro = 0.0;
		double nivelpro = 20-((studentsStratum/students)*100);
		if(nivelpro < 0){
			
		}else if(nivelpro> 0){
			pro = nivelpro;
		}
		return pro;
	}
	
}