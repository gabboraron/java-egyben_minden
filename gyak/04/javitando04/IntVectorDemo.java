import util.IntVector;
import java.util.Arrays;

class IntVectorDemo {
    public static void main(String[] args) {
		int tmp [] = new int[] {1,2,3};
        IntVector v = new IntVector(tmp);
		v.add(1);
        System.out.println(v);
        //System.out.println("****");
        System.out.println(Arrays.toString(tmp));
        //System.out.println("///");

        int[] ns =  new int[] {1,2,3};
        IntVector v2 = new IntVector(ns);
        System.out.println(v2);
        ns[0] = 10;             
		//System.out.println("|||");
        System.out.println(Arrays.toString(ns));
    }
}