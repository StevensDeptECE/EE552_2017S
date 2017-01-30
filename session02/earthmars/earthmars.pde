PShape earth;  
PShape mars;  


void setup() {
  size(800,800, P3D);
  PImage img = loadImage("earthmap1k.jpg");
  noStroke();
  sphereDetail(20); 
  earth = createShape(SPHERE, 400);
  earth.setTexture(img);
  mars = createShape(SPHERE, 200);
  mars.setTexture(loadImage("mars_1k_color.jpg"));
}

float earthRot = 0, marsRot = 0;
float earthOrbitAng = 0;
float marsOrbitAng = 0;
void draw() {
  background(0);
  translate(width/2, height/2);
  pushMatrix();
  rotateY(earthOrbitAng);
  translate(400,0);
  rotateY(-earthOrbitAng);
  rotateY(earthRot); 
  shape(earth);
  popMatrix();
  rotateY(marsOrbitAng);
  translate(600,0);
  rotateY(-marsOrbitAng);
  rotateY(marsRot);   
  shape(mars);
}