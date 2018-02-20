public class Point{

    private double x;
    private double y;
    
    //new Point(252665.256, -25556256.25) - kor hívódik meg.
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }
    
    public double getX() { //getter ->neked mi az Xed?
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) { //setter -> X-ed legeyen: 
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";    
    }
}
