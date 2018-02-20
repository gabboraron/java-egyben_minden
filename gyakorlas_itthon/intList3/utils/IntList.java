import java.lang.*;
import java.util.*;

public class IntList{
	
	private int[] list ;
	private int idx;
	
	//KONSTRUKTOROK
	public IntList (){
		this.list = new int[0];
	}
	
	public IntList (String[] elems){
		this.list = new int[elems.length];
		int j=0;
		for(String i : elems){
			this.list[j] = Integer.parseInt(i);
			++j;
		}
	}
	
	//GETTEREK
/*	public static int[] getList(){
		return list;
	} */
	
	//ELJÁRÁSOK
	public void add(int elem){
		/*int newLength = this.list.length +1;
		int tmp [] = new int[newLength];*/
		//tmp = list.clone();
		int[] tmp = Arrays.copyOf(this.list, this.list.length+1);
		/*System.out.println(elem);
		System.out.println(newLength);
		System.out.println(tmp.length);
		System.out.println(this.list.length);
		System.out.println(this.list.length+1);*/
		tmp[tmp.length-1] = elem;
		this.list = Arrays.copyOf(tmp, tmp.length);
		/*for(int i = 0; i<this.list.length; ++i){
			System.out.println(tmp[i]);
		}*/
	}
	
	public void add(int elem, int index){
		int[] tmp = Arrays.copyOf(this.list, this.list.length+1);
		int tmpElem = 0;
		int sndTmpElem;
		for(int i=0; i<tmp.length; ++i){
			if(i == index){
				tmpElem = tmp[i];
				tmp[i] = elem;
			}
			if(i>index){
				sndTmpElem = tmp[i];
				tmp[i] = tmpElem; 
				tmpElem = sndTmpElem;
			}
		}
		this.list = Arrays.copyOf(tmp, tmp.length);
		/*for(int i = 0; i<this.list.length; ++i){
			System.out.println(tmp[i]);
		}*/
	}
	
	public int size(){
		return this.list.length;
	}
	
	public int get(){
		return this.list[0];
	}
	
	public int get(int index){
		return this.list[index];
	}
	
	public void set(int elem, int index){
		if((index<this.list.length) && (index > -1)){
			this.list[index] = elem;
		}
	}
	
	public void remove(){
		int tmp[] = new int[this.list.length-1];
		for(int i = 1; i<this.list.length; ++i){
			tmp[i-1] = this.list[i];
		}
		this.list = Arrays.copyOf(tmp,tmp.length);
	}
	
	public void remove(int index){
		int[] tmp = new int[this.list.length-1];
		int j = 0;
		for(int i = 0; i<this.list.length; ++i){
			if(i !=  index){
				tmp[j] = this.list[i];
				++j;
			}
		}
		this.list = Arrays.copyOf(tmp,tmp.length);
	}
	
	public int indexOf(int elem){
		for(int i = 0; i<this.list.length; ++i){
			if(this.list[i] == elem)
				return(i);
		}
		return -1;
	}
	
	public void clear(){
		this.list = new int[0];
	}
	
	public int[] toArray(){
		return this.list;
	}
	
	public String toString(){
		String s = "";
		for(int i : this.list){
			s += String.valueOf(i);
		}
		return s;
	}
	
	/*public void concat(IntList fstList,IntList sndIntList){
		//System.out.println(sndIntList.size());
		int tmp[] = Arrays.copyOf(this.list, fstList.size() + sndIntList.size());
		
		for(int i = 0; i<tmp.length; ++i){
			System.out.println(tmp[i]);
		}
	}*/
	
	public void concat(IntList sndList){
		/*for(int i = 0; i<this.list.length; ++i){
			System.out.println(this.list[i]);
		}
		System.out.println("||||");
		sndList.printIt();*/
		int[] tmp = new int[this.list.length + sndList.size()];
		for(int i = 0; i<this.list.length; ++i){
			tmp[i] = this.list[i];
		}
		
		int j = this.list.length;
		for(int i = 0; i<sndList.size(); ++i){
			tmp[j] = sndList.get(i);
			++j;
		}
		this.list = Arrays.copyOf(tmp, tmp.length);
		/*for(int i : tmp){
			System.out.println(i);
		}*/
	}
	
	/*public void concat(IntList fstList, IntList sndList){
		fstList.printIt();
		sndList.printIt();
	}*/
	
	public void printIt(){
		for(int i : this.list){
			System.out.println(i);
		}
	}
	
	public Vector<String> fromString(String str){
		int ewrythingIsAwesome = 0;
		for(int i = 0; i<str.split(" ").length; ++i){
			for(int j = 0; j<str.split(" ")[i].length(); ++j){
				if(!Character.isDigit(str.split(" ")[i].charAt(j)))
					ewrythingIsAwesome = 1;
			}
		}
		
		//System.out.println(ewrythingIsAwesome);
		Vector<String> tmp = new Vector<>();
		if(ewrythingIsAwesome == 0){
			for(int i = 0; i<str.split(" ").length; ++i){
				tmp.add(str.split(" ")[i]);
			}
		}
		return null;
	}
	
	// TEST 
	public static void main(String[] args){
		IntList ilist = new IntList(args);
		myMain(new IntList(args));
	}
	
	public static void myMain(IntList args){
		//args.add(5);
		//args.add(15, 4);
		//System.out.println(args.get());
		//System.out.println(args.get(4));
		//args.set(32, 2);
		//args.remove();
		//args.remove(5);
		//System.out.println(args.indexOf(2));
		//args.clear();
		//System.out.println(args.toArray()[5]);
		//System.out.println(args.toString());
		
		//System.out.println("*****");
		//String[] tmpIntList = {"21","22","23","24"};
		//args.concat(new IntList(tmpIntList));
		//args.printIt();
		//args.fromString("Alma a fa alatt nyari piros alma");
		//args.fromString("1 2 0 3 4545 89899 565689 5689 5 2558 5a");
	}
}