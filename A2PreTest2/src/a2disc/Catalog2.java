package a2disc;

public class Catalog2 {
	//DataMembers
	private Item[] items;
	
	//Constructor
	public Catalog2() {
		items = new Item[ 10 ];
	}
	
	//getter
	public Item[] getAllItems() {
		return items;
	}
	
	//add
	public void add( Item[] i ) {
		for (int index=0; index<i.length; index++) {
			items[index] = new Item(i[index].getData());
		}
	}
	
	public String toString() {
		String result = "[ ";
		for (Item i : items)
			if (i != null)
			result += i + " ";
		return  result + " ]";
	}
}
