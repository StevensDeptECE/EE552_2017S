void setup() {
  size(600,500);
  //frameRate(1);
}

int x = 0, y = 0;
int dx = 2, dy = 1;
// int is 32 bit  +/- 31 bit = 2.1 billion
void draw() {
  fill(0,0,0,10);
  rect(0,0, width-1,height-1);
  fill(255,0,0);
  stroke(0,0,255);
  strokeWeight(5);
  rect(x,y, 30, 70, 5, 10, 20, 30);
  x = x + dx; // x++;  x += 1; ++x;
  y += dy;
  if (x >= width - 30 || x < 0) {
    dx = -dx;
  }
  if (y >= height - 70 || y < 0) {
    dy = -dy;
  }
  /*
  if (x < 0) {
    dx = -dx;
  }*/
}

void mousePressed() {
  ellipse(mouseX, mouseY, 50,50);  
}