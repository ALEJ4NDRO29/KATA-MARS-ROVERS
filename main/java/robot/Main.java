package robot;

public class Main {

	public static void main(String[] args) {
		RobotMars tot = new RobotMars();
		
		tot.move("f,f,b,l,b");
		
		System.out.println(tot.toString());
	}

}
