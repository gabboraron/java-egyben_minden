package tracker;

import java.util.Objects;

public class Label{
	private String name;
	
	//KONSTRUKTOR
	Label(String name){
		this.name = name;
	}
	
	//GETTEREK
	public String getName(){
		return this.name;
	}
	
	public boolean isName(String fstName, String sndName){
		return fstName.equals(sndName);
	}
}