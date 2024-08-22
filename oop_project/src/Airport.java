//code runner
import java.util.*;
public class Airport {
	Terminal d1;
	Terminal i1;
	Airport(){
		d1= new DomesticTerminal(10);
		i1= new InternationalTerminal(10);
	}
	
	public void populateTerminal() {
		PassengerFlight inFlight1 = new InternationalFlight("1I","Boeing 710", 120);
		PassengerFlight inFlight2 = new InternationalFlight("2I","Boeing 710", 120);
		PassengerFlight inFlight3 = new InternationalFlight("3I","Boeing 710", 120);
		PassengerFlight inFlight4 = new InternationalFlight("4I","Boeing 710", 120);
		PassengerFlight inFlight5 = new InternationalFlight("5I","Boeing 710", 120);
//		PassengerFlight inFlight6 = new InternationalFlight("6I","Boeing 710", 120);
//		PassengerFlight inFlight7 = new InternationalFlight("7I","Boeing 710", 120);
		
		PassengerFlight domFlight1 = new DomesticFlight("1D", "Airbus A320", 150);
		PassengerFlight domFlight2 = new DomesticFlight("2D", "Airbus A320", 150);
		PassengerFlight domFlight3 = new DomesticFlight("3D", "Airbus A320", 150);
		PassengerFlight domFlight4 = new DomesticFlight("4D", "Airbus A320", 150);
		PassengerFlight domFlight5 = new DomesticFlight("4D", "Airbus A320", 150);
//		PassengerFlight domFlight6 = new DomesticFlight("5D", "Airbus A320", 150);
//		PassengerFlight domFlight7 = new DomesticFlight("6D", "Airbus A320", 150);
//		PassengerFlight domFlight8 = new DomesticFlight("7D", "Airbus A320", 150);
		
		
		
		Passenger p1 = new Passenger("Person 1");
		Passenger p2 = new Passenger("Person 2");
		Passenger p3 = new Passenger("Person 3");
		Passenger p4 = new Passenger("Person 4");
		Passenger p5 = new Passenger("Person 5");
		Passenger p6 = new Passenger("Person 6");
		Passenger p7 = new Passenger("Person 7");
//		Passenger p8 = new Passenger("Person 8");
//		Passenger p9 = new Passenger("Person 9");
		
		
		
		p1.bookFlight(inFlight1);
		p1.bookFlight(domFlight1, "soup");
		p2.bookFlight(domFlight2,"noodles");
		p2.bookFlight(inFlight2);
		p3.bookFlight(domFlight3);
		p3.bookFlight(inFlight3,"bread");
		p4.bookFlight(domFlight3);
		p5.bookFlight(inFlight3, "pizza");
		p6.bookFlight(domFlight4);
		p6.bookFlight(domFlight5);
		p6.bookFlight(inFlight4);
		p7.bookFlight(inFlight5);
		p7.bookFlight(domFlight5);
		p7.bookFlight(inFlight4);
		
		d1.addFlight(domFlight1);
		d1.addFlight(domFlight2);
		d1.addFlight(domFlight3);
		d1.addFlight(domFlight4);
		d1.addFlight(domFlight5);
		
		i1.addFlight(inFlight1);
		i1.addFlight(inFlight3);
		i1.addFlight(inFlight2);
		i1.addFlight(inFlight4);
		i1.addFlight(inFlight5);
		
		
		
		//DELETE PASSENGER TEST FROM FLIGHT
//		this.displayPassengers(domFlight5);
//		domFlight5.cancelTicket(p6);
//		this.displayPassengers(domFlight5);
		
		//ADD PASSENGER TO A FLIGHT->DONE
		
		// DELETE FLIGHT FROM TERMINAL
		this.displayTerminalFlights(i1);
		i1.removeFLight(inFlight1);
		this.displayTerminalFlights(i1);

	}
	public void displayTerminalFlights(Terminal t) {
//		System.out.println(i1.getFlights().toString());
		for (var i : t.getFlights()) {
			System.out.print(i.getRegistrationNumber()+'\t');
		}
		System.out.println();
		
	}
	
	public void displayPassengers(PassengerFlight p) {
		for (var i : p.getPassengerList()) {
			System.out.print(i.getName()+" ");
		}
		System.out.println();
	}
	

	
	public static void main(String args[]) {
		
		Airport obj = new Airport();
		obj.populateTerminal();
//		obj.displayTerminal();
	}
	
}
