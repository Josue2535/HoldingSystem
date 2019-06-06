package model;
public abstract class Company extends LegalPerson{
	public final static char AGRISILVIHUNTFISH = 'A';
	public static final char EXPLOMINESQUARRIES = 'B';
	public static final char MANUFACTURING = 'C';
	public static final char ELECGASSTEAM = 'D';
	public static final char CONSTRUCTION = 'E';
	public static final char COMMERCE  = 'F';
	public static final char TRANSSTORAGECOMU = 'G';
	public static final char ESTINSUESTATESERV = 'H';
	public static final char SOCIALCOMUNAL = 'I';
	
	private char type;
	
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
	public Company(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative, char type){
		super(String name, String nit, String address, int phone, int employed, double valueAseets, String constitutionDate,  String legalRepresentative);
		this.type = type;
	}
}