package a2disc;

public class Catalog2 {
	private Item[] items;
	public Catalog2() {
		items = new Item[ 10 ];
	}
	public Item[] getAllItems() {
		return items;
	}
	public void add( Item[] i ) {
		items = i;
	}
	public String toString() {
		String result = "[ ";
		for (Item i : items)
			result += i + " ";
		return  result + " ]";
	}
}
