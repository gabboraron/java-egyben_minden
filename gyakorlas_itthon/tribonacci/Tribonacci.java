class Tribonacci {
    public static void main(String[] args) {
        
        int tn1 = 0;
        int tn2 = 0;
        int tn3 = 0;
        int sn = 0;

        int n = Integer.parseInt(args[0]);
        System.out.println(Tribonacci(n));

        //Test(n);
    }

    public static int Tribonacci(int n) { 

        if (n > 2) {
        	return ( Tribonacci(n-1) + Tribonacci(n-2) + Tribonacci(n-3) );	
        }
 
        if (n == 2) {
        	return (1);	
        }
 
        if (n == 1) {
        	return (0);	
        }

        if (n == 0) {
        	return (0);	
        } 

        return(0);
	} 

	public static void Test(int n){
		for (int i=0; i<n; ++i) {
			System.out.println(Tribonacci(i));
		}
	}
}