package market;

public class Fruit{
	private String name;	//gyümölcs neve
	private int price;		//gyümölcs ára
	
	//KONSTRUKTOROK
	public Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public boolean cheaperThan(int currentFruitPrice){
		return(currentFruitPrice>this.price);
	}
	
	public static Fruit make(String name, int price){
		if(((name.length()>2) && (name.matches("[a-zA-Z]+"))) && ((price>-1)&&(price<5000)&&(((price % 2) == 0) || ((price % 2) == 5)))){
			return new Fruit(name,price);
		}
		return null;
	}
	
	public String show(){
		String tmpOfPrice = String.valueOf(this.price);
		if(tmpOfPrice.length()>3){
			int nr = 1;
			String tmpOfTmpOfPrice = "";
			for(int i=0; i<String.valueOf(this.price).length(); ++i){
				if(nr>3){
					tmpOfTmpOfPrice += " "; 
					nr = 1;
				}else{
					tmpOfTmpOfPrice += String.valueOf(this.price);
					++nr;
				}
			}
		}
		return this.name+tmpOfPrice+" Ft";
	}
	
	private Fruit cheapestFruit(){
		/*if(){
			
		}*/
		return null;
	}
	
	public Fruit getCheapestFruit(){
		return cheapestFruit();
	}
	
}