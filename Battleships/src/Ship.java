
public abstract class Ship {
	protected int length;
	protected int[] damage;
	
	public Ship(int length){
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
