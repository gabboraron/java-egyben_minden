class IntList{
	
	//VÁLTOZÓK
	private int list [] = new int[0];
	private int i = 0;
	
	//KONSTRUKTOROK
	public IntList() {
		i = 0;
	}
	
	public IntList(String[] elems) {
		this.list = new int[elems.length];
		i = 0;
		for (String j : elems){
			this.list[i] = Integer.parseInt(j);
			++i;
		}
	}
	
	
	public void ShowIt(int a){
		/*for(int i : list){
			System.out.println(i);
		}		*/
		System.out.println(a);
	}
	
	public static void main(String[] args){
		//IntList(args);
		IntList list2 = new IntList(args);
		list2.ShowIt(list2.list[0]);
	}
	
	/*
	public static int[] add(int[] l, int a){
		l[l.length+1] = a;
		return l;
	}
	
	public static int[] addInd(int[] l, int a, int ind){
		int j = 0;
		boolean ok = false;
		int tmp = 0;
		
		for(int i : l){
			if(ok == false){
				if(j == ind){
					ok = true;
					tmp = i;
					l[j] = a;
				}
				++j;
			}else{
				l[j] = tmp;
				tmp = i;
				++j;
			}
		}
		l[j] = tmp;
		
		return (l);
	}
	*/
}