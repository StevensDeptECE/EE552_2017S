//f(x) = x^2
float f(float x) { return x*x; }

void hello() {
  println("hello");
}

void setup() {
  hello();
  println(f(3));
  float z = f(3);
  println(z);
  println((int)Math.round(f(1.9f)));
  int y = (int)f(1.9f);
  println(y);
  
  exit();
}