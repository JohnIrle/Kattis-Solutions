import java.util.Scanner;

public class Cold {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int collected = input.nextInt();

    int count = 0;
    for(int i = 0; i < collected; i++) {
      if(input.nextInt() < 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}