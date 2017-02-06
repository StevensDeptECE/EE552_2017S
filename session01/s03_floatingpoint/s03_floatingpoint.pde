void setup() {
  float f = 1.234567;
  float f2 = 12.34567;
  float f3 = 123456.7;
  double d = 1.23456789012345;
  println(f);
  println(d);
  
  for (int i = 0; i < 10; i++)
    print(i);
  println();
  
  for (float i = 0; i < 10; i++)
    print(i, "");
  println();
  
  for (float i = 1000000; i < 1000010; i++)
    print(i, "");
  println();

// 10 to 8 does NOT work.  Not trying...
  for (float i = 1000000; i < 1000010; i++)
    print(i, "");
  println();

  for (float i = 0; i < 10; i = i + 0.1f)
    print(i, "");
  println();

/*
   1/2 = 0.5
   1/4 = .25
   1/10 = 0.1
   
   1/3 = .3333333
   
   .10101010011110101
   
   1/2  1/4  1/8  1/16 ....
   
   1/10 = 1/16 + 1/64 + 1/256 + ...
   
   .00010101010101010101
   
   10 = 5 * 2







*/


}