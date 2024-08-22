
public class PremiumGoods extends Goods {
	public static final String type="Premium";
	
	PremiumGoods(double weight){
		super(weight);
	}
	public String getGoodsType() {
		return type;
	}
}
