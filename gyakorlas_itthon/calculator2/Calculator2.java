class Calculator2{
	
	public static int[] a;
	public static int b;
	
	public static void loadInputs(String[] args){
		String[] res = args[0].split(",");

		a = new int[res.length];
		
		int i = 0;
		for(String s : res) {
			a[i] = Integer.parseInt(s);
			++i;
		}
		
		b = Integer.parseInt(args[1]);
	}
	
	public static int[] add(){
		int[] result = new int[a.length];
		int i = 0;
		for (int j : a) {
			result[i] = j + b;
			++i;
        }
		
		return result;
	}
	
	public static void display(int[] result){
		for (int j : result) {
			System.out.println(j);
        }
	}
	
	public static void main(String[] args){
		loadInputs(args);
		display(add());
	}
}