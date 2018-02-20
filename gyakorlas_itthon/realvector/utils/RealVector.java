import java.util.*;

public class RealVector{	
	//private Vector<Integer> tmp = new Vector<>();
	
	public static int scalarMultiplication(Vector<Integer> fst, Vector<Integer> snd){
		/*Vector tmp = new Vector();
		System.out.println("fst: " + fst.size());
		System.out.println("snd: " + snd.size());
		System.out.println("tmp: " + tmp.size());*/
		
		int tmp = 0;
		for(int i = 0; i<fst.size(); ++i)
			tmp += fst.get(i) * snd.get(i);
			//System.out.println(fst.get(i));
			//System.out.println(fst.get(i).getClass().getName());
		
		System.out.println(tmp);
		return tmp;
	}
	
	public static Vector<Integer> summation(Vector<Integer> fst, Vector<Integer> snd){
		Vector<Integer> tmp = new Vector<>();
		for(int i=0; i<fst.size(); ++i){
			tmp.add(fst.get(i) + snd.get(i));
		}
		return tmp;
	}
	
	public static Vector<Integer> subtraction(Vector<Integer> fst, Vector<Integer> snd){
		Vector<Integer> tmp = new Vector<>();
		for(int i=0; i<fst.size(); ++i){
			tmp.add(fst.get(i) - snd.get(i));
		}
		return tmp;
	}	
	
	public static Vector<Integer> multiplicationWithScalar(Vector<Integer> vec, int scal){
		Vector<Integer> tmp = new Vector<>();
		for(int i=0; i<vec.size(); ++i){
			tmp.add(vec.get(i)*scal);
		}
		return tmp;
	}
	
	public static StringBuilder toString(Vector<Integer> vec){
		StringBuilder str = new StringBuilder("");
		for(Integer i : vec){
			str.append(i);
		}
		return str;
	}
	
	public static  ArrayList toArrayList(Vector<Integer> vec){
		ArrayList al = new ArrayList(vec.size());
		for(Integer i : vec)
			al.add(i);
		return al;
	}
	
	public static void main(String[] args){
		Vector<Integer> fst = new Vector<>();
		Vector<Integer> snd = new Vector<>();
		
		fst.add(1);
		fst.add(2);
		fst.add(3);
		fst.add(4);
		fst.add(5);
		fst.add(6);
		fst.add(7);
		fst.add(8);
		
		snd.add(8);
		snd.add(7);
		snd.add(6);
		snd.add(5);
		snd.add(4);
		snd.add(3);
		snd.add(2);
		snd.add(1);
		
		//int t = scalarMultiplication(fst, snd);
		//System.out.println(summation(fst, snd).get(0));
		//System.out.println(subtraction(fst, snd).get(0));
		//System.out.println(multiplicationWithScalar(fst, 2).get(0));
		//System.out.println(toString(fst));
		//System.out.println(toArrayList(fst).get(0));
	}
}