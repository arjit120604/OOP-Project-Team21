
public class DomesticTerminal extends Terminal {
	DomesticTerminal(int capacity){
		super(capacity);
	}
	DomesticTerminal(int capacity,  PassengerFlight[] flights){
		super(capacity, flights);
	}
	public String getType() {
		return "Domestic";
	}
	public boolean canAddFlight(PassengerFlight p) {
		if (this.flights.size()<this.capacity && p instanceof DomesticFlight)
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
