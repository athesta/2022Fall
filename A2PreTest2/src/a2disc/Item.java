package a2disc;

public class Item {
	
	//Data Members
	String data;
	
	//Constructor
	public Item( String d) {
		this.data = d;
	}
	
	
	public String getData() {
		return data;
	}


	//Getter
	public void setData(String d) {
		this.data = d;
	}
	
	//ToString
	public String toString() {
		return "[" + data + "]";
	}


}
