package in.inheritanceee;

public class Circle extends Shap{
	private int radius;
    
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
    public  void area() {
    	
		double d= Shap.PI*radius*radius;
		System.out.println(d);
    }
    }
    

