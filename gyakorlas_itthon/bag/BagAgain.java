import java.util.*;
import java.io.*;
import java.lang.*;

public class BagAgain<T>{
	public Map<T, Integer> myMap;
	
	public void add(T element){
		if(myMap.get(element) != null ){
			myMap.put(element, myMap.get(element) + 1);
		} else {
			myMap.put(element, 1);
		}
	}
	
	public int countOf(T element){
		if(myMap.get(element) != null){
			return myMap.get(element);
		}
		return 0;
	}
	
	public void remove(T element){
		myMap.put(element, myMap.get(element)-1);
		if(myMap.get(element) == 0){
			myMap.remove(element);
		}
	}
	
}