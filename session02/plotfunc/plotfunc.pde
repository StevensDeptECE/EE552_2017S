void setup() {
  size(800,800);
}

float f(float x) {
  return x*x; 
}
void draw() {
  // graph [-3,+3,  0, +9]
  translate(width/2, height-1);
  scale(width/6.0, -1/9.0*height); 
  float dx = 1.0/width*(3 - -3);
  for (float x = -3; x <= +3; x+= dx)
    line(x,0, x, f(x));
}