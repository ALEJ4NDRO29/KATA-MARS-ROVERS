package robot;

import java.util.Arrays;
import java.util.List;

public class RobotMars {

	private Orientation position;
	private Coords coords;
	

	public RobotMars() {
		position =  new Orientation();
		coords = new Coords();
	}

	public char getPosition() {
		return position.getPosition();
	}

	public void setPosition(Orientation position) {
		this.position = position;
	}

	public int getX() {
		return coords.getX();
	}

	public int getY() {
		return coords.getY();
	}
	
	
	@Override
	public String toString() {
		return "RobotMars [x=" + coords.getX() + ", y=" + coords.getY() + ", position=" + position.getPosition() + "]";
	}

	public void roverLeft() {
		position.roverLeft();
		
	}

	public void roverRight() {
		
		position.roverRight();
	
	}

	public void roverLeft(int times) {
		for (int i = 0; i < times; i++) {
			roverLeft();
		}
	}

	public void roverRight(int times) {
		for (int i = 0; i < times; i++) {
			roverRight();
		}
	}

	public void fordward() {
		coords.fordward(position.getPosition());
	}

	public void backward() {
		coords.backward(position.getPosition());
		
	}

	public void move(String dir) {

		List<String> commands = Arrays.asList(dir.split(","));

		for (int i = 0; i < commands.size(); i++) {
			String command = commands.get(i);

			switch (command) {
			case "l":
				roverLeft();
				break;
			case "r":
				roverRight();
				break;
			case "f":
				fordward();
				break;
			case "b":
				backward();
				break;

			}
		}

	}


	
}