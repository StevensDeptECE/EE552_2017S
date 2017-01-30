void setup() {
  size(700,700); 
}

void sierpinski(float x1, float y1,
                float x2, float y2,
                float x3, float y3, int level) {
  if ( level == 0) {
    // draw a triangle
    return;
  }
  // compute midpoints
  // subtract one from level
  sierpinski( );
  sierpinski( );
  sierpinski( );                  
}
int n = 0;
void draw() {
  sierpinski(0,height-1, width/2,0, width-1,height-1, n);
  n++;
  if (n > 8)
    n = 0;
}