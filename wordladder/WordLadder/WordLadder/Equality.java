


public class Equality{

	public static void main(String[] args){
		System.out.println(Integer.MAX_VALUE);
		Integer a = new Integer(200);
		Integer b = new Integer(200);
		Integer c = 200;
		Integer c2 = Integer.valueOf(200);
		Integer d = new Integer(10);
		Integer e = 10;
		Integer f = Integer.valueOf(10);
		String g = new String("almafa");
		String h = new String("almafa");
		String i = "kortefa";
		String j = new String("kortefa").intern();
		String k = new String("kortefa");

		if (g==h){
			System.out.println("g==h");
		} else {
			System.out.println("g!=h");
		}
		if (i==k){
			System.out.println("i==k");
		} else {
			System.out.println("i!=k");
		}
		if (g=="almafa"){
			System.out.println("g==\"almafa\"");
		} else {
			System.out.println("g!=\"almafa\"");
		}
		if (i==j){
			System.out.println("i==j");
		} else {
			System.out.println("i!=j");
		}		
		if (i=="kortefa"){
			System.out.println("i==\"kortefa\"");
		} else {
			System.out.println("i!=\"kortefa\"");
		}

		

		if (a==b){
			System.out.println("a==b");
		} else {
			System.out.println("a!=b");
		}
		if (b==c){
			System.out.println("b==c");
		} else {
			System.out.println("b!=c");
		}
		if (c==c2){
			System.out.println("c==c2");
		} else {
			System.out.println("c!=c2");
		}
		if (d==e){
			System.out.println("d==e");
		} else {
			System.out.println("d!=e");
		}
		if (e==f){
			System.out.println("e==f");
		} else {
			System.out.println("e!=f");
		}		
	}
}