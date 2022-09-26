package a2disc;

public class Catalog1 {
	
	//DataMembers
	Item[] items;
	
	//Constructor
	public Catalog1() {
		items = new Item[ 10 ];
	}
	
	//getter
	public Item getItem(int i) {
		return items[ i ];
	}
	
	//Add
	public void add( Item i, int pos) {
		//Original: items[ pos ] = i;
		items[pos] = new Item(i.getData());
			
	}
	
	
	
	public String toString() {
		String result = "[ ";
		for (Item i : items)
			if (i != null)
				result += i + " ";
		return  result + " ]";
	}
}
