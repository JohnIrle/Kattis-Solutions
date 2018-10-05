import java.util.Scanner;

public class Pot {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int addends = in.nextInt();
    int[] p = new int[addends];
    int i = 0;

    while (i < addends) {
      p[i] = in.nextInt();
      i++;
    }

    int x = 0;

    for(int j = 0; j < addends; j++) {
      int power = p[j] % 10;
      int number = p[j] / 10;
      x += Math.pow(number, power);
    }

    System.out.println(x);
  }

}