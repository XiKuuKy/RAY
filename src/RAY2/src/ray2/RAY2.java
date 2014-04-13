package ray2;

import processing.core.PApplet;


public class RAY2 extends PApplet {

	public void setup() {
		size(800,800);
		frame.setTitle("RAY 2");
		background(255,0,0);
	}

	public void draw() {
		if (mousePressed) {
			stroke(0,0,255);
			line(0,0,mouseX,mouseY);
			line(400,0,mouseX,mouseY);
		}
	}
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { ray2.RAY2.class.getName() });
	}
}
