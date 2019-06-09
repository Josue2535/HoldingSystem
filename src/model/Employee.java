package model;

public class Employee{
	private String name;
	private String position;
	private String mail;
	
	public Employee(String name, String position, String mail){
		this.name = name;
		this.position = position;
		this.mail = mail;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPosition(){
		return position;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public String getMail(){
		return mail;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
	
	
}