package asset;

//有形資産を管理する場合に有効なクラスの作成
public abstract class TangibleAsset extends Asset implements Thing {

	private String color;
	private double weight;
	
	//コンストラクタ
	public  TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;	
	}
	
	//getter
	public String getColor() {	return this.color;	}
	public double getWheight() {return this.weight;}
	
	//setter
	public void setWeight(double weight) {this.weight = weight;}

}
