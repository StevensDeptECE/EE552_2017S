void setup() {
  int a = 2100000000;
  short b = 32767;
  long c = 123456789012345678L;
  
  println(2 + 3);
  println(4 - 8);
  println(4 * 5);
  println(2 * 3 + 4);
  println(2 + 3 * 4);
  println(2 / 3, 3 / 4, 5 / 4);
  println(2 % 3, 3 % 3, 4 % 3, 5 % 3);
  println(-2 % 3, -3 % 3, -4 % 3, -5 % 3);
//  long age = 69;
//  println(age * 365 * 24 * 60 * 60);
  long seconds = 69L * 365L * 24L * 60 * 60;
  println(seconds);
  seconds = 69L * 365 * 24 * 60 * 60;
  println(seconds);
  seconds = 69 * 365 * 24 * 60 * 60L;
  println(seconds);
  
  seconds = 6900 * 365 * 24 * 60 * 60L;
  println(seconds);
  
  
  exit();
}