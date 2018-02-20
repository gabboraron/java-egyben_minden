package snake;

import java.util.*;
import java.lang.*;
import snake.Snake;
import snake.Apple;
import snake.util.*;
import snake.exception.*;
import snake.parts.*;

public class Game{
	final List<Apple> apples;
	final Snake snake;
	
	public static List<Apple> toApples(List<String> lines)
	throws IllegalArgumentException {
		System.out.println("LOG-Game: |toApples START|");
		if( lines == null ){
			throw new IllegalArgumentException();
		}
		
		List<Apple> appleListToReturn = new ArrayList<Apple>();
		
		for(String line:lines){
			try{
				String[] currentLineParts = line.split(" ");
				Position myPos = new Position(Integer.parseInt(currentLineParts[0]), Integer.parseInt(currentLineParts[1]));
				Apple myApple = new Apple(myPos);
				
				appleListToReturn.add(myApple);				
			} catch (Exception e) {
			}
		}
		System.out.println("LOG-Game: |toApples END|");
		return appleListToReturn;
	}
	
	public Game(List<String> apples){
		this.apples = toApples(apples);
		System.out.println("LOG-Game: |"+apples.get(0)+"|");
		System.out.println("LOG-Game: SIZE: "+apples.size()+"|");
		Position snakeHeads = new Position((int)0,(int)1);					//ITT HAL MEG!
		System.out.println("LOG-Game: snakeHeads: "+snakeHeads.getRow()+","+snakeHeads.getColumn()+"|");
		Position snakeTails = new Position(0,0);
		snake = new SnakeHead(snakeHeads, snakeTails, this);
	}
	
	public Apple getApple(){
		if(apples.isEmpty()){
			return null;
		}
		return apples.get(0);
	}
	
	public void ateApple(){
		apples.remove(0);
	}
	
	public String play(List<String> moves){
		StringBuilder toReturn = new StringBuilder();
		boolean tmpBool = true;
		int idx = 0;

		while(tmpBool && (idx < moves.size())){
			try{
				String move = moves.get(idx);
				String[] parts = move.split(" ");
				if(parts.length == 2){
					snake.move(Direction.valueOf(parts[0]), Integer.valueOf(parts[1]));
				}
				
				if(parts.length ==1){
					snake.move(Direction.valueOf(move));
				}
				printState(toReturn);
				++idx;
			} catch (CollisionException e){
				toReturn.append("GAME OVER");
				tmpBool = false;
			} catch (Exception e){
			}
		}
		return toReturn.toString();
	}
	
	public void printState(StringBuilder myString){
		PositionMap<Character> posMap = new PositionMap(' ');
		snake.print(posMap);
		
		if(!apples.isEmpty()){
			apples.get(0).print(posMap);
		}

		for(int i=0; i<Position.SIZE_OF_BOARD; ++i){
			for(int j=0; j<Position.SIZE_OF_BOARD; ++j){
				Position tmpPos = new Position(i,j);
				Character charAtPos = posMap.get(tmpPos);
				myString.append(charAtPos);
			}
			myString.append(System.lineSeparator());
		}
		myString.append("==========");
		myString.append(System.lineSeparator());
	}
	
}