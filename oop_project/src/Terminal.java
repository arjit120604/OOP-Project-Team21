import java.util.ArrayList;

public abstract class Terminal {
	protected int capacity;
	protected ArrayList<PassengerFlight> flights;
	Terminal(int capacity){
		this.capacity=capacity;
		this.flights= new ArrayList<PassengerFlight>();
	}
	Terminal(int capacity, PassengerFlight[] flights){
		this.capacity=capacity;
		this.flights= new ArrayList<PassengerFlight>();
		for (int i=0;i<flights.length;++i) {
			if(flights[i]!=null);
			this.flights.add(flights[i]);
		};
	}
	public abstract String getType();
	
	public int getCapacity() {
		return this.capacity;
	}
	public PassengerFlight[] getFlights() {
		PassengerFlight[] arr = new PassengerFlight[this.flights.size()];
		for(int i=0;i<arr.length;++i) {
			arr[i]=this.flights.get(i);
		}
		return arr;
	}
	public abstract boolean canAddFlight(PassengerFlight p);
	protected boolean canAddFlight() {
		if (this.flights.size()<this.capacity)
			return true;
		else
			return false;
	}
	public void addFlight(PassengerFlight p) {
		
		if (canAddFlight())
			this.flights.add(p);
		else
			return;
			
	}
	public void removeFLight(PassengerFlight p) {
		try {
			int index  = this.flights.indexOf(p);
			if (index == -1)
				index = this.flights.size();
			this.flights.remove(index);
			
		}catch(Error e){
			//not found case
			return;
		}
	}
	
	
	
}
