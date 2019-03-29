package test;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import robot.RobotMars;

public class TestMars {

	@Test
	void startPoint() {
		RobotMars robot = new RobotMars();

		assertEquals(robot.getX(), 0);
		assertEquals(robot.getY(), 0);
		assertEquals(robot.getPosition(), 'n');
	}

	@Test

	void roverLeft() {
		RobotMars robot = new RobotMars();

		robot.roverLeft();

		assertEquals(robot.getPosition(), 'w');

	}

	@Test
	void roverLeftTwoTimes() {
		RobotMars robot = new RobotMars();

		robot.roverLeft(2);

		assertEquals(robot.getPosition(), 's');

	}

	@Test
	void roverRight() {
		RobotMars robot = new RobotMars();

		robot.roverRight();

		assertEquals(robot.getPosition(), 'e');
	}

	@Test
	void roverRightThreeTimes() {
		RobotMars robot = new RobotMars();

		robot.roverRight(3);

		assertEquals(robot.getPosition(), 'w');

	}

	@Test
	void fordward() {
		RobotMars robot = new RobotMars();

		robot.fordward();

		assertEquals(robot.getX(), 0);
		assertEquals(robot.getY(), 1);
		

	}
	@Test
	void backward() {
		RobotMars robot = new RobotMars();

		robot.backward();

		assertEquals(robot.getX(), 0);
		assertEquals(robot.getY(), -1);
		
	}

	@Test
	void moveCommand() {
		RobotMars robot = new RobotMars();

		robot.move("f,f,b,l,b");
		

		assertEquals(robot.getPosition(), 'w');
		assertEquals(robot.getX(), 1);
		assertEquals(robot.getY(), 1);

	}

}
