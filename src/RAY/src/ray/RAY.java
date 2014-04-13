package ray;



import processing.core.PApplet;


public class RAY extends PApplet {

	public void setup() {
		size(800,800);
		frame.setTitle("RAY Drawing");
		background(5,5,5);
	}

	public void draw() {
		if (mousePressed) {
			stroke(255,255,255);
			line(0,0,mouseX,mouseY);
		}
	}

	
	public static void main(String _args[]) {
		PApplet.main(new String[] { ray.RAY.class.getName() });
	}
}
