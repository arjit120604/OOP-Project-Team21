import java.util.ArrayList;

public class PassengerFlight implements plane {
	private String registrationNumber;
    private String model;
    private String type;
    private int seats;
    private int bookedSeats=0;
    private ArrayList<Passenger> passengers;
    private ArrayList<String> meal;
    private ArrayList<Crew> crew;
	public PassengerFlight(String reg, String model, int seats) {
		this.type="Passesnger";
		this.registrationNumber= reg;
		this.model= model;
		this.seats= seats;
		this.passengers = new ArrayList<Passenger>();
		this.meal = new ArrayList<String>();
		this.crew = new ArrayList<Crew>();
//		this.passengers= new Passenger[seats];
	}
	public String getType() {
		return this.type;
	};
    public String getRegistrationNumber() {
    	return this.registrationNumber;
    }
    public String getModel() {
    	return this.model;
    }
    public int getRemainingSeats() {
    	return this.seats-this.bookedSeats;
    }
    private boolean canBookSeat() {
    	return this.bookedSeats<this.seats;
    }
    public void bookTicket(Passenger p) {
    	if (canBookSeat()) {
    		this.passengers.add(p);
    		this.bookedSeats++;
    	}
    }
    public void bookTicket(Passenger p, String meal) {
    	if (canBookSeat()) {
    		this.passengers.add(p);
    		this.bookedSeats++;
    		this.meal.add(meal);
    	}
    	
    }
    public void cancelTicket(Passenger p) {
    	int c=0;
    	for (Passenger i : this.passengers) {
    		if (i==p) {
    			this.passengers.remove(c);
    			this.bookedSeats--;
    			
    			break;
    		}
    		c++;
    	}
    }
    public void cancelTicket(Passenger p, String meal) {
    	int passengerIndex = passengers.indexOf(p);
        if (passengerIndex != -1) {
            passengers.remove(passengerIndex);
            bookedSeats--;
            // Ensure bookedMeals list exists and index is valid
            if (meal != null) {
                this.meal.remove(this.meal.indexOf(meal));
            }
        }
    }
    public Passenger[] getPassengerList() {
    	Passenger[] passengerArray = new Passenger[passengers.size()];
        for (int i = 0; i < passengers.size(); i++) {
            passengerArray[i] = passengers.get(i);
        }
        return passengerArray;
    }
    public String[] getBookedMealArray() {
        if (meal == null) {
            return new String[0];
        }
        String[] mealArray = new String[meal.size()];
        for (int i = 0; i < meal.size(); i++) {
            mealArray[i] = meal.get(i);
        }
        return mealArray;
    }
    public void addCrew(Crew ...crew) {
    	for (int i=0;i<crew.length;i++) {
    		this.crew.add(crew[i]);
    	}
    }

}
