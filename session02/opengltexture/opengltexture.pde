PShape earth;  


void setup() {
  size(800,800, P3D);
  PImage img = loadImage("earthmap1k.jpg");
  noStroke();
  sphereDetail(20); 
  earth = createShape(SPHERE, 400);
  earth.setTexture(img);
}

float z = 0;
float ang = 0;
void draw() {
  background(0);
  translate(width/2, height/2, z);
  rotateY(ang); 
  shape(earth);
  if (z > -600)
    z -= 2;
  ang += .01;
}