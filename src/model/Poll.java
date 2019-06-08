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
}