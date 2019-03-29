package robot;

public class Coords {

	private int x;
	private int y;
	
	public Coords() {
		x = 0;
		y = 0;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void fordward(char position) {
		switch (position) {
		case 'n':
			y++;
			break;
		case 'e':
			x++;
			break;
		case 'w':
			x--;
			break;
		case 's':
			y--;
			break;

		}		
	}

	public void backward(char position) {
		switch (position) {
		case 'n':
			y--;
			break;
		case 'e':
			x--;
			break;
		case 'w':
			x++;
			break;
		case 's':
			y++;
			break;

		}

	}
	
}
