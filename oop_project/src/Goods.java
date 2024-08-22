
public abstract class Goods {
	double weight;
	Goods(double weight){
		this.weight=weight;
	}
	public abstract String getGoodsType();
	public double getGoodsWeight() {
		return weight;
	};
}
