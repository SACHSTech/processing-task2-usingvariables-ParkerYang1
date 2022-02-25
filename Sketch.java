import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(100, 100);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(71, 218, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    fill(0, 128, 0);
    rect(0, height/1.6f, width, height/1.6f);
    
    fill(200, 155, 125);
    rect(width/8, height/2.6f, width/2.6f, height/2.6f); 

    fill(125, 65, 45);
    rect(width/6.6f, height/4.4f, width/16, height/6.6f);
    
    fill(125, 65, 45);
    triangle(width/8, height/2.6f, width/2, height/2.6f, width/3.2f, height/5);

    fill(255, 255, 0);
    ellipse(width/1.2f, height/6.6f, width/4, height/4);

    fill(255, 197, 143);
    rect(width/3.2f, height/1.9f, width/6.6f, height/4.4f);

    fill(255, 255, 255);
    rect(width/6.6f, height/1.9f, width/8, height/8);

    fill(0, 0, 0);
    line(width/4.7f, height/1.9f, width/4.7f, height/1.5f);

    fill(0, 0, 0);
    line(width/6.6f, height/1.7f, width/3.6f, height/1.7f);

    fill(0, 0, 0);
    ellipse(width/2.3f, height/1.5f, width/26.6f, height/26.6f);
  }
}