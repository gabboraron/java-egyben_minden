import java.io.*;
import java.lang.*;

public class Test<T>{
	private T myGeneric;
	public Test(T currentGeneric){
		this.myGeneric = currentGeneric;
	}
	
	public T getGeneric(){
		return this.myGeneric;
	}
	
	public String createAGenericFromConsoleParameters(){
		System.out.print("Add something: ");
		String tmp = "";
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tmp =  br.readLine();
		} catch (IOException e){
			System.out.println("EXCEPTION");
		}
		return tmp;
	}
	
	
	public static void main(String args[]){
		Test myTest = new Test(args[0]);
		Test mySndTest = new Test(myTest.createAGenericFromConsoleParameters());
		System.out.println("myTest: " + myTest.getGeneric());
		System.out.println("mySndTest: " + mySndTest.getGeneric());
	}
}