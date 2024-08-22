import java.util.ArrayList;

public class CargoFlight implements plane {
	private String registrationNumber;
    private String model;
    private String type;
    private double maxWeight;
    private double currentWeight;
    private ArrayList<Goods> goods;
    private ArrayList<Crew> crew;
    private int maxNumber;
    private int currNumber;
	public CargoFlight(String reg, String model,int maxNumber,  double maxWeight) {
		this.type="Passenger";
		this.registrationNumber= reg;
		this.model= model;
		this.maxWeight=maxWeight;
		this.currentWeight=0;
		this.maxNumber=maxNumber;
//		this.goods= new Goods[maxNumber];
		this.currNumber=0;
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
    private boolean canAddGood(int n, double weight) {
    	if (this.currNumber+n>maxNumber) {
    		return false;
    	}
    	if (this.currentWeight+weight>this.maxWeight)
    		return false;
    	return true;
    }
    public void addGoods(Goods ...goods) {
    	double wt=0;
    	for(Goods i : goods) {
    		wt+=i.getGoodsWeight();
    	}
    	if (!canAddGood(goods.length,wt)) {
    		return;
    	}
    	for (int i =0;i<goods.length;i++) {
    		this.goods.add(goods[i]);
    		this.currentWeight+=goods[i].getGoodsWeight();
    	}
    }
    public double getAverage() {
    	try {
    		return (this.currentWeight/this.currNumber);
    	}catch(Error e){
    		//divide by zero error
    		return 0;
    	}
    }
    public void removeGoods(Goods ...goods) {

        for (Goods goodToRemove : goods) {
            int index = -1;
            for (int i = 0; i < this.goods.size(); i++) {
                Goods goodInCargo = this.goods.get(i);
                if (goodInCargo == goodToRemove) {
                    index = i;
                    break;
                }
            }
            
            if (index != -1) {
                this.goods.remove(index);
                this.currentWeight -= goodToRemove.getGoodsWeight();
                this.currNumber--;
            }
        }
    }
    public void addCrew(Crew ...crew) {
    	for (int i=0;i<crew.length;i++) {
    		this.crew.add(crew[i]);
    	}
    }
}
