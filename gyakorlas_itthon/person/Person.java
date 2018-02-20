public class Person{
		
		public String VEZETEK;
    	public String KERESZT;
    	public String FOGLALKOZAS;
    	public Gender NEME;
    	public int SZUL;

    	public void makePerson(String vnev, String knev, String fog, String nem, int datum) {
			if ((datum>1900) && (datum<2017) ) {
				VEZETEK = vnev;
				KERESZT = knev;
				FOGLALKOZAS = fog;
				
				if (nem == "ferfi") {
					NEME.MALE = true;
				} else {
					NEME.FEMALE = true;
				}

				SZUL = datum;
			}
    	}
    	////
    	//System.out.println(vnev);
    	////

		/*public static void main(String[] args){
			///
			///
			int minutes = 0;
			for (int ms = 0; ms < 60 * 60 * 1000; ms++){
				if (ms % 60  * 1000 == 0 ){
					minutes++;
				}
			}
			System.out.println(minutes);
		}*/
}