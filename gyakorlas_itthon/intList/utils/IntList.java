import java.util.*;

class IntList{
	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	//private int list [] = new int[0];
	//private int i = 0;
	
	
	//KONSTRUKTOR
	public IntList (){
		//i=0;
	}
	
	public IntList(String[] elems){
		//this.list = new int[elems.length];
		//i = 0;
		for (String j : elems){
		//	this.list[i] = Integer.parseInt(j);
			list.add(Integer.parseInt(j));
		//	++i;
		}
	}
	
	//OSZTÁLY MUVELETEI
	
	//egy új elem hozzáadása a tömb végére
	public static void add(String elem){	
		//this.list = new int[]
		list.add(Integer.parseInt(elem));
	}
	
	//elem beszúrása az adott indexu helyre
	public static void add(String elem, int index){	
		if(index<list.size()){
			// *** //
			//int tmp = list.get(index);
			//list.add(index,Integer.parseInt(elem));
			//add(Integer.toString(tmp),index+1);
			// *** //
			Integer tmpList[] = new Integer[list.size()-index];
			int j = 0;
			for(int i = index; i<list.size(); ++i){
				tmpList[j] = list.get(i);
				++j;
			}
			
			list.add(index,Integer.parseInt(elem));
			j=0;
			for(int i = index+1; i<list.size(); ++i){
				list.add(i,Integer.parseInt(tmpList[j]));
				++j;
			}
			list.add(Integer.parseInt(tmpList[j]));
		} else {
			list.add(Integer.parseInt(elem));
		}
	}
	
	/***/ //TEST// /***/
	public static void printItAll(){
		for(Integer i : list){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		new IntList(args);
		printItAll();
		add("99", 4);
		printItAll();
	}
	/***/ //// /***/
}