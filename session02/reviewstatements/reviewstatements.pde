void setup() {
  int a = 2 + 3 * 4;
  int b = a / 3 * 4;
  int c = a % 3 * 4;
  println(b, c);
  float x = sin(c) + sin(2*c)/2 +
    sin(3*c)/3;

  int n = 5;
  if (n % 2 != 0) {// odd
    println("odd");
  } else {
    println("even");
  }
  
  if (3 < 2)
  {
    println("yes");
    println("maybe");
  } else
  {
    println("no!");
    println("way");
  }
 
  // + - * / %
  // float + - * / NOT modulo
  // unary - +
  float z = 3;
  println(-z / (z + 1));
  
  // a += b; a -= b;  a *= b;  a /=b;  a %= b;
  
  int x = 0;
  while (x < 10) {
    print(x);
    x += 1;
  }
  
  int y = 3;
  y *= 2 + 1;
  
  int a = 1, b = 2, c = 3, d = 4;
  a += b *= c -= d;
  
  
  
  
  
  
  exit();
}