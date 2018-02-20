import java.util.Arrays;

class Calculator {
    public static void main(String[] args) {

		String[] res = args[0].split(",");

		int[] resInt = new int[res.length];
		
		int i = 0;
		for(String s : res) {
			//resInt.add(Integer.parseInt(s));
			resInt[i] = Integer.parseInt(s);
			++i;
		}
		
		
		for (int j : resInt) {
            //System.out.println(Integer.parseInt(j) + args[1]);   //  <- fordítva
			System.out.println(j + Integer.parseInt(args[1]));
        }
		
    }
}