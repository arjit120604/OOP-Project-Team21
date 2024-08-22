public class StandardGoods extends Goods {
	public static final String type="Standard";
	StandardGoods(double weight){
		super(weight);
	}
	public String getGoodsType() {
		return type;
	}
}