
public class InternationalFlight extends PassengerFlight {
	public InternationalFlight(String reg, String model, int seats) {
		super(reg, model, seats);
	}
	public String getTypeOfPassengerFlight() {
		return "International";
	}
}
