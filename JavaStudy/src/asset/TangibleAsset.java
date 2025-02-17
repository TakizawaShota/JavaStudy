package asset;

//有形資産を管理する場合に有効なクラスの作成
public abstract class TangibleAsset extends Asset{

	private String color;
	
	//コンストラクタ
	public  TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;	
	}
	
	//getter
	public String getColor() {	return this.color;	}

}
