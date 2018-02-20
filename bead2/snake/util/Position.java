package snake.util;

import snake.exception.*;
import java.lang.*;

public class Position{
	public static final int SIZE_OF_BOARD = 10;
	final int row;
	final int column;
	
	public Position(int rowIdx, int columnIdx){
		System.out.println("LOG-Position: I'm here!");
		boolean good = false;
		if(good == false)
			System.out.println("LOG-Position: good init: false"); 		//////////////////////////////////////////
			
		if((rowIdx > -1) && (rowIdx < SIZE_OF_BOARD)){
			good = true;
		}
	
		if(good && ((columnIdx > -1) && (columnIdx < SIZE_OF_BOARD))){
			good = true;
		}else{
			good = false;
		}
		
		System.out.println("LOG-Position: rowIdx: "+rowIdx+"|");
		System.out.println("LOG-Position: columnIdx: "+columnIdx+"|");
		
		
		if(good){
			System.out.println("LOG-Position: good: true");
			this.row = rowIdx;
			this.column = columnIdx;
		}else{
			System.out.println("LOG-Position: good: false");
			throw new InvalidIndexException();
		}
	}
	
	public int getRow(){
		return this.row;
	}
	
	public int getColumn(){
		return this.column;
	}
	
	public boolean isSame(Position that){
		if((that != null) && ((this.row == that.getRow()) && (this.column == that.getColumn()))){
			return true;
		}
		return false;
	}
	
	public boolean equals(Position that){
		return isSame(that);
	}
	
}