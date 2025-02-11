package areaCalculation;

public class AreaCalculation {

	public static void main(String[] args) {
		
	double tirangleArea = calcTriangleArea(10.0, 5.0);
	double circleArea = calcsaCircleArea(5.0);
	
	System.out.println("三角形の面積"+tirangleArea);
	
	System.out.println("円の面積"+circleArea);
	

	}
	
	//三角形の面積を計算するメソッド
	public static double calcTriangleArea(double bottom, double height) {
		
		return bottom * height / 2;
	}
	
	//円の面積を計算するメソッド
	public static double calcsaCircleArea(double radius) {
		
		return radius * radius * 3.14;
	}

}
