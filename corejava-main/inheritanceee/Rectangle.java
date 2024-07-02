package in.inheritanceee;

public class Rectangle extends Shap{
	private int length;
    private int width;
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
     public  void area() {
    	
		double d= Shap.PI*length*length;
		System.out.println(d);
		
}
}