public class Circle implements Comparable{
	private double x = 0.0;
	private double y = 0.0;
	private double r = 0.0;
	
	public Circle(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getR(){
		return this.r;
	}
	
	@Override
	public int hashCode(){
		return java.util.Objects.hash(r);
	}
	
	@Override
	public boolean equals(Object obj){
		Circle other = (Circle) obj;
		return other.getR() == this.getR();
	}
}