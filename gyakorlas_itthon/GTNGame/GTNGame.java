import java.util.Random;
import java.lang.*;
import java.io.*;

public class GTNGame{
	private int maxNum;
	private int number;
	private boolean failedToInit = true;
	
	public GTNGame (String tmp[]){
		try{
			maxNum = Integer.parseInt(tmp[0]);
			if(maxNum >0){
				this.maxNum = maxNum;
				this.failedToInit = false;
			} else {
				System.out.println("THE MAX VALUE MUST BE A POSITIVE NUMBER");
			}
		} catch (Exception e) {
			System.out.println("YOU MUST SET AN VALID VALUE");
		}
	}
	
	public void setMaxNum(int maxnum){
		this.maxNum = maxnum;
	}
	
	public int getMaxNum(){
		return this.maxNum;
	}
	
	public void setTheGuessedNumber(){
		int number = -1;
		try{
			Random randomno = new Random();
			number = randomno.nextInt(getMaxNum());
		}catch (IllegalArgumentException e) {
			System.out.println("WRONG MAX VALUE");
		}
		this.number = number;
	}
	
	public int getTheGuessedNumber(){
		return this.number;
	}
	
	public void log(){
		System.out.println("Max value sat as: " + getMaxNum());
		System.out.println("The guessed number is: " + getTheGuessedNumber());
	}
	
	public String readFromConsole()
	throws IOException {
		System.out.println("Think a number!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public void tryMe(){
		boolean guessed = false;
		while (!guessed){
			try{
				int idea = Integer.parseInt(readFromConsole());
				if(idea == getTheGuessedNumber()){
					guessed = true;
					System.out.println("(:		YOU GOT IT!		:) ");
				} else if(idea > getTheGuessedNumber()) {
					System.out.println("Think a bit lower!");
				} else {
					System.out.println("Think a bit higher!");
				}
			} catch (IOException e){
				System.out.println("IO ERROR");
			} catch (NumberFormatException e){
				System.out.println("ARE YOU THINKING A NUMBER?");
			}
		}
	}
	
	public void tryTheUser(){
		if(!this.failedToInit){
			tryMe();
		}
	}
	
	public static void main(String args[]){
		GTNGame maxnum = new GTNGame(args);
		maxnum.setTheGuessedNumber();
		//maxnum.log();
		maxnum.tryTheUser();
		
		
		/*int maxValue = 0;
		Integer tmp = Integer.parseInt(args[0]);
		int tmpInt = tmp.intValue( );
		maxValue = maxValue.setMaxNum(tmpInt);
		maxValue.setTheGuessedNumber();
		maxValue.log();*/
		
	}
}