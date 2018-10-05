import java.util.Scanner;

public class Batterup {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double atBat = input.nextDouble();

    double numer = 0;
    double denom = 0;

    for(int i = 0; i < atBat; i++) {
      double number = input.nextDouble();
      if(number == -1) {
        numer += 0;
        denom += 0;
      } else {
        numer += number;
        denom ++;
      }
    }
    System.out.println(numer/denom);
  }
}