package util;
import java.util.Arrays;

public class IntVector {
    int ns[];

    public IntVector(int[] numbers) {
		ns = numbers;
    }

    public void add(int n) {
		for (int i = 0; i < ns.length; i++)
			ns[i] += n;
    }

    public String toString() {
		return Arrays.toString(ns);
    }/*

    public void add(int x){
        for (int i: ns) {
            i += x;            
        }
    }

    public String toString(){
        String tmp = "[";
        for (int i : ns) {
            tmp += i+" ";
        }
        return(tmp+"]");
    }*/
}