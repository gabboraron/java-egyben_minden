import findinfiles.Finder;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Main{
	public static void main(String[] args){
		try{
			Finder finder = new Finder("output.txt");
			System.out.println("Text to find?");
			try(
				Scanner sc = new Scanner(System.in);
			){
				String stringtofind = sc.nextLine();
				finder.printFile(args[0]);
				System.out.println(finder.findText(stringtofind,args[0]));
				sc.close();	
			} /*catch (ArrayIndexOutOfBoundsException e){
				System.err.println("You must have at least one file!");
			} */
		} catch(IOException e){
			e.printStackTrace();
		} 	
	}
}