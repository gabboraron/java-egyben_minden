class Main{
	
	/** 
	dokumentációs komment
	*/
	
	public static void main(String[] args){
		/*
		több
		több soros komment
		*/
		// egy soros komment
		int i = 0;
		double valami = 0.4;
		boolean ittVagyok = false;
		String s = "Hello world!";
		String s2 = "";
		char c = 'j';
		while (!ittVagyok)
		{
			i++;
			if (i % 5 == 0){
				ittVagyok = true;
				System.out.println("Oszthato 5-tel");
			}else {
				System.out.println(s);
			}
		}
		
		/*s2 = "Bandi";
		switch (s2){
			case "Bandi" : System.out.println(s); s2 = "Sanyi"; break;
			case "Sanyi" : System.out.println("Nem O!"); break;
			default: System.out.println("Default"); 
		}
		switch (s2){
			case "Bandi" : System.out.println(s); s2 = "Sanyi"; break;
			case "Sanyi" : System.out.println("Nem O!"); break;
			default: System.out.println("Default"); 
		}
		
		switch (s2){
			case "Bandi" : System.out.println(s); s2 = "Sanyi"; 
			case "Sanyi" : System.out.println("Nem O!"); 
			default: System.out.println("Default"); 
		}
	
		*/
	}
}