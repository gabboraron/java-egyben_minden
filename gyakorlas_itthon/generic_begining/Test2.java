import java.lang.*;
import java.util.*;
import java.io.*;

public class Test2 <T, V>{
	private T fst;
	private V snd;
	
	public Test2(){}
	public Test2(T fst, V snd){
		this.fst = fst;
		this.snd = snd;
	}
	/*public Test2(Object tmp){
		Test2 other = (Test2) tmp;
		//System.out.println("***");
		//System.out.println("other.getFst(): " + other.getFst());
		///System.out.println("***");
		this.fst = other.getFst();
		this.snd = other.snd;
	}*/
	
	public T getFst(){
		return this.fst;
	}
	public V getSnd(){
		return this.snd;
	}
	
	public Test2 getFromConsole(){
		String tmp1 = "";
		String tmp2 = "";
		try{
			System.out.print("Add T: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			tmp1 = br.readLine();
			System.out.print("Add V: ");
			BufferedReader brr = new BufferedReader(new InputStreamReader (System.in));
			tmp2 = brr.readLine();

		} catch(IOException e){
			System.out.println("ERR");
		}	
		return new Test2(tmp1,tmp2);
	}
	
	public static void main(String args[]){
		Test2 myTest = new Test2(args[0], args[1]);
		Test2 mySndTest = new Test2();
		mySndTest = mySndTest.getFromConsole();
		System.out.println("pair1: " + myTest.getFst() + ", " + myTest.getSnd());
		System.out.println("pair2: " + mySndTest.getFst() + ", " + mySndTest.getSnd());
	}
}