import java.util.Scanner;

public class Faktor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numArts = input.nextInt();

    int factor = input.nextInt();

    int mincite = numArts * (factor - 1) + 1;

    System.out.println(mincite);
  }
}