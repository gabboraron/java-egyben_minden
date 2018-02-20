class rekursiv {
    public static void main(String[] args) {
        int tmp = Integer.parseInt(args[0]);
        rekursiv(tmp);
    }

    public static void rekursiv(int tmp) { 
        if (tmp < 10) {
        	System.out.println("n="+ tmp);
        	rekursiv(tmp+1);
        } 
	} 
}