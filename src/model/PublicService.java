package model;
import java.util.ArrayList;

public class PublicService extends ServiceCompany implements Taxable{
	
	public static final int SEWERAGE = 1;
	public static final int ENERGY = 2;
	public static final int AQUEDUCT = 3;
	
	private int typeService;
	private int subscribers;
	private int subscribersStratum;
	
	public PublicService(String name, String nit, String address, int phone, int employee, double value, String constitutionDate,  String legalRepresentative, String type, String types, int typeService, int subscribers, int subscribersStratum){
		super(name, nit, address, phone, employee, value, constitutionDate, legalRepresentative, type, types);
		this.typeService=typeService;
		this.subscribers=subscribers;
		this.subscribersStratum=subscribersStratum;
	}
	public double calctTaxeble(){
		double pro = 0.0;
		double nivelpro = 20-((subscribersStratum/subscribers)*100);
		if(nivelpro < 0){
			
		}else if(nivelpro> 0){
			pro = nivelpro;
		}
		return pro;
	}
}