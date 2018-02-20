import utils.basics.Point;

public class ColouredPoint<ColourType> extends utils.basics.Point{
	private ColourType colour;
	
	public ColouredPoint(){
		super(0.0,0.0);
	}
	
	public void setColour(ColourType  myColour){
		this.colour = myColour;
	}

	public ColourType getColour(){
		return this.colour;
	}
}