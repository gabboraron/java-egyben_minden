import java.io.*;
import java.lang.*;
import java.util.*;

public class Bag<T>{
	private	Map<T, Integer>[] nrOfItems = new Bag<T>();
	
	public Bag(){
		boolean tmpBool = true;
		String tmp = "";
		System.out.println("Set a new value, or exit by adding 'EXIT' - Item");
		while(tmpBool){
			System.out.print("Set new item: ");
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				tmp = br.readLine();
			} catch (IOException e) {
				System.out.println("IO ERROR");
				tmpBool = false;
			}
			if(tmp == "EXIT"){
				tmpBool = false;
			} else {
				add(tmp);
			}
		}
	}
	
	public void add(T element){
		//for(int i=0; i<)
	}
}