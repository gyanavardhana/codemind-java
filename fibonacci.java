import java.util.Scanner;

 class Fibonacci {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int prev1 = 0;
    int prev2 = 1;
    int current;

    System.out.print(prev1 + " " + prev2);

    for (int i = 2; i < n; i++) {
      current = prev1 + prev2;
      System.out.print(" " + current);
      prev1 = prev2;
      prev2 = current;
    }

    System.out.println();
  }
}
