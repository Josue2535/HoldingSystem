package model;

public class Poll{
	private int serviceRendered;
	private int responseTime;
	private int costBenfit;
	
	public Poll(int serviceRendered, int responseTime, int costBenfit){
		this.serviceRendered = serviceRendered;
		this.responseTime = responseTime;
		this.costBenfit = costBenfit;
	}
	public int getServiceRendered(){
		return serviceRendered;
	}
	public void setServiceRendered(){
		this.serviceRendered = 	serviceRendered;
	}
	public int getResponseTime(){
		return responseTime;
	}
	public void setResponseTime(int responseTime){
		this.responseTime = responseTime;
	}
	public int getCostBenfit(){
		return costBenfit;
	}
	public void setCostBenfit(int costBenfit){
		this.costBenfit = costBenfit;
	}
	public int average(){
		int prom = (serviceRendered+responseTime+costBenfit)/3;
		return prom;
	}
}