
public class DomesticFlight extends PassengerFlight {
	public DomesticFlight(String reg, String model, int seats) {
		super(reg, model, seats);
	}
	public String getTypeOfPassengerFlight() {
		return "Domestic";
	}
}
