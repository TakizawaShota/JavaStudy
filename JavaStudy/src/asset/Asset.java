package asset;

//資産を管理する抽象クラス
public abstract class Asset {
	
	private String name;
	private int price;
	
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//getter
	public String getName() {	return this.name;	}
	public int getPrice() {	return this.price;	}

}
