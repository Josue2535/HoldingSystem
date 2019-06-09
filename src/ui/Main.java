package ui;
import model.*;
import java.util.*;
public class Main{

  /**
  *Relation
  */
	private Holding  user;
   
   //Initializer

	private Scanner reader;

	//Constructor

	public Main(){
		init();
		//String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower)
		reader = new Scanner(System.in);
		user = new Holding ("emcali123","1234","cra33a#29-47",304567894,167,200.4003,"20/02/2014","Andres Mayor","");

	} 
	/**
    *Start of the program 
    */

    public static void main (String[] args){
    	Main m = new Main();
    	m.menu();
    	m.showMenu();
    }
    public void menu(){
    	welcome();
    }
    /**
    *This method is used to create the title of the progam 
    */
    public void welcome(){
    System.out.println(".............................................................................");
    System.out.println("--------------------         Holding SYSTEM              --------------------");
    System.out.println(".............................................................................");

    }
    /**
    *This method serves to show the user the options panel
    */
    public void showOptions(){
  System.out.println("---------------------------------------------------------------------------");
  System.out.println("PLEASE TYPE THE OPTION YOU WANT TO REVIEW."                                 );
  System.out.println("                                                                          |");
  System.out.println("1.Add a company              ");
  System.out.println("                                                                          |");
  System.out.println("2.Business information                ");
  System.out.println("                                                                          |");
  System.out.println("3.Add products            ");
  System.out.println("                                                                          |");
  System.out.println("4.              ");
  System.out.println("                                                                          |");
  System.out.println("5.Add surveys             ");
  System.out.println("                                                                          |");
  System.out.println("6.Add a new employee to the company           ");
  System.out.println("                                                                          |");
  System.out.println("7. Search for an employee extension              ");
  System.out.println("                                                                          |");
  System.out.println("8.Exit the program.                                                        ");
  System.out.println("---------------------------------------------------------------------------");


    }
    /**
    *This method is used to select a menu option
    */
    public void showMenu(){
    	int userInput=0;
   while (userInput != 8){
        showOptions();
        userInput = reader.nextInt();
        reader.nextLine();
    
    if(userInput == 1){
//public PersonalityJuridic(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower){
        
        
    	System.out.println("Enter the name of the company:");
    	String name = reader.nextLine();
		
    	System.out.println("Enter the company's NIT:");
    	String nit =reader.nextLine();
    	
		System.out.println("Enter the address of the company");
    	String addreess = reader.nextLine();
    	
		System.out.println("The company telephone:");
    	String phone =reader.nextLine();
    	
		System.out.println("Employee numbers");
    	int employees = reader.nextInt();
    	reader.nextLine();
    	
		System.out.println("Value (in pesos) of the assets");
    	double valueAseets = reader.nextDouble();
    	reader.nextLine();
    	
		System.out.println("Constitution date");
    	String constitucionDate = reader.nextLine();
    	
		System.out.println("Name of the legal representative:");
    	String legalRepresentative = reader.nextLine();
    	
    	
		reader.nextLine();
    	
    	System.out.println("What type of Organization is:");
    	System.out.println("A. Agriculture, Hunting, Forestry, Fishing");
    	System.out.println("B. Exploitation of mines and quarries.");
    	System.out.println("C. Manufacturing industry ");
    	System.out.println("D. Electricity, gas and steam ");
    	System.out.println("E. Buildin");
    	System.out.println("F. Wholesale and Retail");
    	System.out.println("G. Transportation, storage and communications");
    	System.out.println("H. Financial state, insurance, b.furniture, service to companies ");
    	System.out.println("I. Communal, Social");
    	char type =reader.nextLine().charAt(0);
    	String typeofservice ="";
    	if (type == 'A' ){
    		typeofservice = "Agriculture, Hunting, Forestry, Fishing";
    	}
    	else if (type == 'B'){
    		typeofservice= "Exploitation of mines and quarries";
    	}
    	else if (type== 'C'){
    		typeofservice= "Manufacturing industry";
    	}
    	else if (type == 'D'){
    		typeofservice= "Electricity, gas and steam";
    	}
    	else if (type == 'E'){
    		typeofservice="Buildin";
    	}
    	else if (type== 'F'){
    		typeofservice="Wholesale and Retail";
    	}
    	else if (type == 'G'){
    		typeofservice="Transportation, storage and communications";
    	}
    	else if (type == 'H'){
    		typeofservice="Financial state, insurance, b.furniture, service to companies";
    	}
    	else if (type == 'I'){
    		typeofservice="Communal, Social";
    	}
    	System.out.println("What type of company you want to add");
        System.out.println("1.Education company");
        System.out.println("2.Public services company ");
        System.out.println("3.Technology company");
        System.out.println("4.Medicines Company");
		System.out.println("5.Manufacturing Company");
        System.out.println("6.Food company ");
        int valor= reader.nextInt();
        reader.nextLine();
        String typeT = "";
        if (valor== 1){
			typeT = "Education company";
        	System.out.println("Enter the approval registration number before the MEN");
        	String numRegistry = reader.nextLine();
        	System.out.println("Enter the number of years accredited as a high quality entity:");
        	int acreeditedYears = reader.nextInt();
        	reader.nextLine();
        	
        	
        	System.out.println("Name of the rector");
        	String rectorName = reader.nextLine();
			System.out.println("Cantidad de estudiantes activos estrato 1 y 2 ");
        	int strataOneandTwo = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Cantidad total de estudiantes activos");
        	int qualityTotal = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Select the education sector:");
        	System.out.println("1. High School");
        	System.out.println("2.University");
        	int estatustype = reader.nextInt();
        	reader.nextLine();
        	if (type == 1){
				System.out.println("Enter the national position According to exams saber11");
				int positionSaber11 = reader.nextInt();
				reader.nextLine();        		
				HighSchool ms = new HighSchool(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, numRegistry, acreeditedYears, strataOneandTwo, qualityTotal, positionSaber11);
				user.addCompany(ms);
			}
        	else if (type == 2){
				System.out.println("Enter the national position According to exams saberPro");
				int  positionSaberPro = reader.nextInt();
				reader.nextLine();
				University m = new University(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, numRegistry, acreeditedYears, strataOneandTwo, qualityTotal, positionSaberPro);
				user.addCompany(m);
        	}
        	
        	System.out.println("The company has been correctly registered");
        	//name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative

            

        }
        //String typeOfService, int subscribersActual,int subscribersOneandTwo)
        else if (valor==2){
			typeT = "Public service";
        	System.out.println("Please select the type of service you provide:");
        	System.out.println("1.Sewerage");
        	System.out.println("2.Energy");
        	System.out.println("3.Aqueduct");
        	int typeSer =reader.nextInt();
        	reader.nextLine();
        	String typeOfService="";
        	if (typeSer ==1){
        		typeOfService= "Sewerage";
        	}
        	else if (typeSer== 2){
        		typeOfService="Energy";
        	}
        	else if (typeSer ==3){
        		typeOfService="Aqueduct";
        	}
        	System.out.println("Total number of subscribers");
        	int subscribersActual = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Number of subscribers of estarto 3, 4, 5 and 6");
        	int subscribersOneandTwo= reader.nextInt();
        	reader.nextLine();
        	PublicService services = new PublicService(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT,subscribersActual,subscribersOneandTwo);
        	user.addCompany(services);





        }
        else if (valor==3){
        	typeT = "Technology";
			System.out.println("How much energy have you used?:");
			int energy = reader.nextInt();
			reader.nextLine();
			
			System.out.println("How many services does it provide:");
			int servp = reader.nextInt();
			reader.nextLine();
			Technology  enem= new Technology(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, energy);
			for(int i = 0; i < servp; i++){
				System.out.println("Seleccione el tipo de servicio:");
				System.out.println("1.Consultoria");
				System.out.println("2.Capacitacion");
				System.out.println("3.Desarrollo de Software");
				System.out.println("4.Infraestructura como servicio.");
				System.out.println("5.Software como servicio.");
				System.out.println("6.Plataforma como servicio");
        	
				int typeService = reader.nextInt();
				reader.nextLine();
        	
				if (typeService== 1 ){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService ==2){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService == 3){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService== 4){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService == 5){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService == 6){
					enem.getServices().add(Technology.CONSULTANCY);
				}
			}
			user.addCompany(tecnologia);
        	
        }
        else if (valor==4){
			typeT = "Manufacturing";
        	System.out.println("enter the sanitary registry");    
			String sanitary = reader.nextLine();
			System.out.println("enter the state of sanitary registry:");
			System.out.println("1. Valid");
			System.out.println("2. not renewed");
			int sta = reader.nextInt();
			reader.nextLine();
			boolean state = false;
			if(sta == 1){
				state = true;
				
			}else{
				
			}
			Medication medi = new Medication(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, sanitary, state);
			System.out.println("How many products does it have?");
			int algo = reader.nextInt();
			reader.nextLine();
			for(int i = 0; i<algo; i++){
				System.out.println("Enter name of product");
				String namep = reader.nextLine();
				System.out.println("Enter code of product");
				String codep = reader.nextLine();
				System.out.println("How much water do I spend?");
				int waterAmount = reader.nextInt();
				reader.nextLine();
				System.out.println("quantity of products available");
				int units = reader.nextInt();
				reader.nextLine();
				Product pr = new Product(namep, codep, waterAmount, units);
				medi.getProducts().add(pr);
			}

        }else if(valor == 5){
			typeT = "Manufacturing";
			ManufacturingCompany manu = new ManufacturingCompany(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT);
			System.out.println("How many products does it have?");
			int algo = reader.nextInt();
			reader.nextLine();
			for(int i = 0; i<algo; i++){
				System.out.println("Enter name of product");
				String namep = reader.nextLine();
				System.out.println("Enter code of product");
				String codep = reader.nextLine();
				System.out.println("How much water do I spend?");
				int waterAmount = reader.nextInt();
				reader.nextLine();
				System.out.println("quantity of products available");
				int units = reader.nextInt();
				reader.nextLine();
				Product pr = new Product(namep, codep, waterAmount, units);
				medi.getProducts().add(pr);
			}
		}
		
        else if (valor == 6){
        	typeT = "Manufacturing";
			System.out.println("How many group does it have?");
			int algo = reader.nextInt();
			reader.nextLine();
			FoodCompanies foods = new FoodCompanies(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, algo);
			System.out.println("How many products does it have?");
			int algo = reader.nextInt();
			reader.nextLine();
			for(int i = 0; i<algo; i++){
				System.out.println("Enter name of product");
				String namep = reader.nextLine();
				System.out.println("Enter code of product");
				String codep = reader.nextLine();
				System.out.println("How much water do I spend?");
				int waterAmount = reader.nextInt();
				reader.nextLine();
				System.out.println("quantity of products available");
				int units = reader.nextInt();
				reader.nextLine();
				Product pr = new Product(namep, codep, waterAmount, units);
				medi.getProducts().add(pr);
			}

        }

    	
}

    


    else if (userInput == 2){

    	System.out.println(user.showCompanys());

    }
    else if (userInput == 3){

    	System.out.println("A que empresa de manufactura le desea agregar productos ?");
    	System.out.println(user.showNameCompanys()+"\n");
    	String company = reader.nextLine();
    	user.verific(company);
    	System.out.println("Cuantos productos desea agregar: ");
    	int cantProduct= reader.nextInt();
    	reader.nextLine();
    	for (int i = 0; i<cantProduct;i++){
    	System.out.println("Product "+(i+1)+":");
    	System.out.println("Digite el nombre del producto:");
    	String name =reader.nextLine();
    	System.out.println("digite el codigo del producto:");
    	String code = reader.nextLine();
    	System.out.println("Digite la cantidad de agua:");
    	double water = reader.nextDouble();
    	reader.nextLine();
    	System.out.println("Numero de unidades del producto:");
    	int numUnits = reader.nextInt();
    	reader.nextLine();
    	
        Product p = new Product(name,code,water,numUnits);
        if(user.verific(company) != null){
         user.verific(company).add(p);
     }
 }

}
    else if(userInput== 4){


    	System.out.println("A que Empresa de Servicios le desea agregar encuestas:");
    	System.out.println(user.showCompanysNameService());
    	String verific =reader.nextLine();
    	user.verificService(verific);
    	System.out.println("CALIFICA DE 1 A 5 LAS SIGUIENTES PREGUNTAS  SIENDO 1 NADA SATISFECHO Y 5 MUY SATISFECHO ");
    	System.out.println("1.El servicio Prestado ?");
    	int pregunt1 = reader.nextInt();
    	reader.nextLine();
    	System.out.println("2.El tiempo de respuesta dado?");
    	int pregunt2 = reader.nextInt();
    	reader.nextLine();
    	System.out.println("3.La relacion costo/Beneficio alquirido?");
    	int pregunt3 = reader.nextInt();
    	reader.nextLine();

    	Poll pollPrincipal = new Poll (pregunt1,pregunt2,pregunt3);
    	if (user.verificService(verific)!=null){
    	user.verificService(verific).add(pollPrincipal);

    	}

    }

    	}  	
    }


    public void init(){


    }





}