
public class Passenger implements person {
	public static final String type ="Passenger";
	private String meal="";
	private String name;
	Passenger(String name){
		this.name=name;
	}
	Passenger(String name,String meal){
		this.name=name;
		this.meal=meal;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return this.name;
	}
	public void bookFlight(PassengerFlight flight) {
		if (meal!="")
		flight.bookTicket(this);
		else
			flight.bookTicket(this, meal);
	}
	public void bookFlight(PassengerFlight flight, String meal) {
		flight.bookTicket(this, meal);
	}
	
	public void cancelTicket(PassengerFlight flight) {
		if (meal!="")
		flight.cancelTicket(this);
		else
			flight.cancelTicket(this, meal);
	}
	public void cancelTicket(PassengerFlight flight, String meal) {
		flight.cancelTicket(this);
	}
}
