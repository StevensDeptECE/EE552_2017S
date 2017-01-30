void setup() {
  size(800, 600);
}
int n = 4;
void draw() {
  background(255);
  float cx = width/2, cy = height/2;
  float r = 250;

  for (int i = 0; i < n; i++) {
    float theta1 = 2*PI /n*i;
    for (int j = i+1; j < n; j++) {
      float theta2 = 2*PI / n *j;
      float x1 = cx + r*cos(theta1);
      float y1 = cy + r*sin(theta1);
      float x2 = cx + r*cos(theta2);
      float y2 = cy + r*sin(theta2);
      line(x1, y1, x2, y2);
    }
  }
}

void mouseClicked() {
  n++;
}