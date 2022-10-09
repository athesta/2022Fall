package a3disc;

public class ConcreteItem extends AbstractItem {
	private int y;
	
	public ConcreteItem(int xin, int yin) {
		setx( xin );
		y = yin;
	}

	public ConcreteItem(ConcreteItem orig) {
		setx( orig.getx() );
		y = orig.y;
	}

	public String toString() {
		return "[ " + super.toString() + ", " + y + " ]";
	}
}
