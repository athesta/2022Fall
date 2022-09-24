package a2disc;

public class Catalog1 {
	Item[] items;
	public Catalog1() {
		items = new Item[ 10 ];
	}
	public Item getItem(int i) {
		return items[ i ];
	}
	public void add( Item i, int pos) {
		items[ pos ] = i;
	}
	public String toString() {
		String result = "[ ";
		for (Item i : items)
			if (i != null)
				result += i + " ";
		return  result + " ]";
	}
}
