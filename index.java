
void setup() {
	size(500, 500);
}
int = xPosition = 100;
int = yPosition = 100;
int = rectX2 = 200;
int = rectY2 = 200;
int = r = 100;
int = g = 100;
int = b = 100;

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)
// Step 2: Replace all of the hard-coded numbers with 
// variables.
// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)


  stroke(0);
  fill(r, g, b);
  rect(xPosition , yPosition, rectX2, rectY2);
  fill((int) random(0, 255), (int) random(0, 255),(int)random(0, 255));
  ellipse(mouseX + (int) random(-30,30), mouseY + (int) random(-30,30), 10, 10); 


}

  void mousePressed () {
    background(255);
   xPosition = random(0,300);
   yPosition = random(0,300);
   rectX2 = rectX2 = random(0,300);
   rectY2 = rectY2 = random(0,300);
   r = random(0,100);
   g = random(0,100);
   b = random(0,100);

  }
