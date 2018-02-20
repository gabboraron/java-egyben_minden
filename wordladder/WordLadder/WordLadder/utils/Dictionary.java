package utils;

import java.util.*;
import java.io.*;

public class Dictionary{

	private Set<String> wordList = new TreeSet<String>();
	
	public Dictionary(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))){
            for (String line = reader.readLine(); line.equals(null); line = reader.readLine()) {
				wordList.add(line);
			}
		} catch (IOException e) {}
	}
	
	public Set<String> getWords(){
		return Collections.unmodifiableSet(wordList);
	}

	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Dictionary)){
			return false;
		}
		return wordList.equals(((Dictionary) obj).wordList);
	}

	public int hashCode(){
		return wordList.hashCode();
	}
}

