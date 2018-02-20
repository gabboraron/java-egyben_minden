package tracker;



public class Issue{
	String description;
	//Label labels;
	LinkedList labels = new LinkedList();
	int milestone;
	
	//GETTEREK
	public String getDescription(){
		return this.description;
	}
	
	public String getLabels(){
		return this.labels;			//??
	}
	
	public int getMilestone(){
		return this.milestone;
	}
	
	
	//KONSTRUKTOR
	public Issue(String description, Label[] labels, int id){
		this.description = description;
		this.milestone = id;
		for (Label l : labels){
			
		}
	}
}