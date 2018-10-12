import java.util.Scanner;

public class Ladder {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int h = in.nextInt();
    int v = in.nextInt();

    int angle = (180 - (90 + v));

    double ladder = Math.ceil(h / Math.cos(Math.toRadians(angle)));

    System.out.println((int)ladder);
  }
}