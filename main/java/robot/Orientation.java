package robot;

public class Orientation {
	
	private char position;
	
	public Orientation() {
		position = 'n';
		
	}

	public char getPosition() {
		return position;
	}

	public void setPosition(char position) {
		this.position = position;
	}

	public void  roverLeft() {
		switch (position) {
		case 'n':
			position = 'w';
			break;
		case 'e':
			position = 'n';
			break;
		case 'w':
			position = 's';
			break;
		case 's':
			position = 'e';
			break;

		}
		
	}

	public void roverRight() {
		switch (position) {
		case 'n':
			position = 'e';
			break;
		case 'e':
			position = 's';
			break;
		case 'w':
			position = 'n';
			break;
		case 's':
			position = 'w';
			break;

		}
		
	}

}
