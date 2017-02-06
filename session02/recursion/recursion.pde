//A recursive function calls itself
// All recursive function must have an exit condition

//n! = n * (n-1) * (n-2) ...1


int fact(int n) {
  int prod = 1;
  for (int i = 1; i <= n; i++)
    prod = i*prod;
  return prod;
}

// recursive definition: n! = n * (n-1)!
int fact2(int n) {
  if (n <= 1)
    return 1;
  return n * fact2(n-1); //tailrecursion (recursion is last)
}

// add fibo(n) = 1, 1, 2, 3, 5, 8, 13, 21, ...
// fibo2(n) recursively
void setup() {
  println(fact(5));
  println(fact2(5));
}