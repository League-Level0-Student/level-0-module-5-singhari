package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Wikipedia {
	public static void main(String[] args) {
	//drawSquare();
	//	drawTriangle();
		drawCircle();
	}
	public static void drawSquare() {
		Robot robt = new Robot();
		int start = 300;
		robt.setX(start);
		robt.setY(start);
		robt.penDown();
		robt.setSpeed(5);
		robt.setPenColor(0,0,0);
		for(int x = 0; x<4; x++) {
			robt.move(100);
			robt.turn(90);
		}
	}
	public static void drawTriangle() {
		Robot robt = new Robot();
		int start = 300;
		robt.setX(start);
		robt.setY(start);
		robt.penDown();
		robt.setSpeed(5);
		robt.setPenColor(0,0,0);
		for(int x = 0; x<3; x++) {
			robt.turn(120);
			robt.move(100);
		}
	}
	public static void drawCircle() {
		Robot robt = new Robot();
		int start = 300;
		robt.setX(start);
		robt.setY(start);
		robt.penDown();
		robt.setSpeed(5);
		robt.setPenColor(0,0,0);
		for(int x = 0; x<12672; x++) {
			robt.turn(1);
			robt.move(5);
		}
	}
}
