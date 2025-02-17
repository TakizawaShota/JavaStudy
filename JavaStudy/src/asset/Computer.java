package asset;

public class Computer {
	private String name;
	private int price;
	private String color;
	private String makerName;
	
	//コンストラクタ
	public Computer( String name, int price, String color, String makerName) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.makerName = makerName;
	}
	
	//getter
	public String getName() {	return name;	}
	public int getPrice() {	return price;	}
	public String getColor() {	return color;	}
	public String getMakerName() {	return makerName;	}
}
