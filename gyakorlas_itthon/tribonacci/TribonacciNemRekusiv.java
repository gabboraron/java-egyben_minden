class TribonacciNemRekusiv {
    public static void main(String[] args) {
        
        int tn1 = 0;
        int tn2 = 0;
        int tn3 = 0;
        int sn = 0;

        for(int i = 0; i < Integer.parseInt(args[0]); i=i+1) {
            if(i == 0){
		        System.out.println("n=0  ->  Tn=0");
		        tn3 = 0;
            }else{
            	if (i == 1) {
		        	System.out.println("n=1  ->  Tn=0");
		        	tn2 = 0;
            	}else{
            		if (i == 2) {
		        		System.out.println("n=2  ->  Tn=1");
		        		tn1 = 1;
            		}else{
            			if(i > 2){
            				sn = tn3+tn1+tn2;
            				tn3 = tn2;
            				tn2 = tn1;
            				tn1 = sn;
		        			System.out.println("n="+ i +"  ->  Tn="+ sn);
            			}
            		}
            	}
            }
        }
    }
}