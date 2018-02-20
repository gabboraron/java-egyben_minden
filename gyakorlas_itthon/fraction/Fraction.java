public class Fraction implements Comparable<Fraction> {
	private int szamlalo;
	private int nevezo;
	
	public Fraction(int szamlalo, int nevezo){
		this.szamlalo = szamlalo;
		this.nevezo = nevezo;
	}
	
	public int getSzamlalo(){
		return this.szamlalo;
	}
	
	public int getNevezo(){
		return this.nevezo;
	}
	
	@Override
	public boolean equals(Object other){
		if(this == other){
			return true;
		}
		if(this == null){
			return false;
		}
		if(!(other instanceof Fraction)){
			return false;
		}
		
		Fraction otherFraction = (Fraction) other;
		
		return (this.getNevezo() == otherFraction.getNevezo()) && (this.getSzamlalo() == otherFraction.getSzamlalo());
	}
	
	@Override
	public int compareTo(Fraction other){
		int compareOther = Math.round(other.szamlalo/other.nevezo);
		int compareThis = Math.round(this.szamlalo/this.nevezo);
		if(compareOther>compareThis){
			return 1;
		}
		return 0;
	} 
	
	public static void main(String args[]){
		Fraction ab = new Fraction(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		System.out.println(ab.getNevezo());
	}
	
}