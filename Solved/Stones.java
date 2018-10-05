import java.util.Scanner;

public class Stones {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    String w = "";

    if((n % 2) % 2 == 0) {
      w = "Bob";
    } else {
      w = "Alice";
    }

    System.out.println(w);
  }
}