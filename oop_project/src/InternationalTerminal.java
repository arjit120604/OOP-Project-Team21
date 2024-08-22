
public class InternationalTerminal extends Terminal {
	InternationalTerminal(int capacity){
		super(capacity);
	}
	InternationalTerminal(int capacity,  PassengerFlight[] flights){
		super(capacity, flights);
	}
	public String getType() {
		return "International";
	}
	public boolean canAddFlight(PassengerFlight p) {
		if (this.flights.size()<this.capacity && p instanceof InternationalFlight)
			return true;
		else
			return false;
	}
    public void addFlight(PassengerFlight p) {
		
		if (canAddFlight(p))
			this.flights.add(p);
		else
			return;
			
	}
	
}
